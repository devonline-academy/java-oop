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

package academy.devonline.java.section041_oop.restore.impl;

import academy.devonline.java.section041_oop.restore.PasswordResetService;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
final class PasswordResetServiceTest {

    private final PasswordResetService service;

    public PasswordResetServiceTest(PasswordResetService service) {
        this.service = service;
    }

    public void test(String email) {
        System.out.println(email + " -> " + service.reset(email));
    }

    public static void main(String[] args) {
        PasswordResetServiceTest passwordResetServiceTest = new PasswordResetServiceTest(new PasswordResetService(
                new FromRAMAccountRepository(),
                new ShowSuccessAccountNotFoundByEmailHandler(),
                new DisableAccountNotActiveHandler(),
                new DefaultNumberVerificationCodeGenerator(6),
                new StubEmailService()
        ));
        passwordResetServiceTest.test("test0@devonline.academy");
        passwordResetServiceTest.test("test1@devonline.academy");
        passwordResetServiceTest.test("test2@devonline.academy");

        passwordResetServiceTest = new PasswordResetServiceTest(new PasswordResetService(
                new FromRAMAccountRepository(),
                new DisplayAccountNotFoundByEmailHandler(),
                new DisableAccountNotActiveHandler(),
                new DefaultNumberVerificationCodeGenerator(6),
                new StubEmailService()
        ));
        passwordResetServiceTest.test("test0@devonline.academy");
        passwordResetServiceTest.test("test1@devonline.academy");
        passwordResetServiceTest.test("test2@devonline.academy");
    }
}
