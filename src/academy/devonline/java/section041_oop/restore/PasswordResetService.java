/*
 * Copyright 2019. http://devonline.academy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package academy.devonline.java.section041_oop.restore;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public final class PasswordResetService {

    private AccountRepository accountRepository;

    private AccountNotFoundByEmailHandler accountNotFoundByEmailHandler;

    private AccountNotActiveHandler accountNotActiveHandler;

    private VerificationCodeGenerator verificationCodeGenerator;

    private EmailService emailService;

    public PasswordResetService(AccountRepository accountRepository,
                                AccountNotFoundByEmailHandler accountNotFoundByEmailHandler,
                                AccountNotActiveHandler accountNotActiveHandler,
                                VerificationCodeGenerator verificationCodeGenerator,
                                EmailService emailService) {
        this.accountRepository = accountRepository;
        this.accountNotFoundByEmailHandler = accountNotFoundByEmailHandler;
        this.accountNotActiveHandler = accountNotActiveHandler;
        this.verificationCodeGenerator = verificationCodeGenerator;
        this.emailService = emailService;
    }

    public String reset(String email) {
        Account account = accountRepository.findByEmail(email);
        if (account == null) {
            return accountNotFoundByEmailHandler.handle(email);
        } else if (account.isNotActive()) {
            String result = accountNotActiveHandler.handle(account);
            if (result != null) {
                return result;
            }
        }
        String code = verificationCodeGenerator.generate();
        account.setCode(code);
        accountRepository.update(account);
        emailService.sendPasswordResetEmail(email, code);
        return "password_reset_success.html";
    }
}
