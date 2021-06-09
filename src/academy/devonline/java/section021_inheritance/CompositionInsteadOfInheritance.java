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

package academy.devonline.java.section021_inheritance;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class CompositionInsteadOfInheritance {

    private JFrame frame;

    public CompositionInsteadOfInheritance() {
        frame = new JFrame();
        frame.setTitle("Hello world");
        frame.setPreferredSize(new Dimension(500, 300));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CompositionInsteadOfInheritance();
    }
}
