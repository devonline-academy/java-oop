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

package academy.devonline.java.section021_inheritance_and_polymorphism;

import javax.swing.*;
import java.awt.*;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class InheritanceAsReuseCode {

    public static void main(String[] args) {
        new ApplicationWindow().setVisible(true);
    }

    private static class ApplicationWindow extends JFrame {
        public ApplicationWindow() throws HeadlessException {
            setTitle("Hello world");
            setPreferredSize(new Dimension(500, 300));
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            pack();

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);
        }
    }
}
