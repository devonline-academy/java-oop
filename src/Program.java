/**
 * Usage:
 * ===============================================================
 * For Windows:
 * <p>
 * SET DEVONLINE=test
 * java Program
 * <p>
 * SET DEVONLINE=qwerty
 * java Program
 * <p>
 * ===============================================================
 * For MacOS/Linux:
 * <p>
 * export DEVONLINE=test
 * java Program
 * <p>
 * export DEVONLINE=qwerty
 * java Program
 * <p>
 * ===============================================================
 *
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Program {
    public static void main(String[] args) {
        System.out.println(System.getenv("DEVONLINE"));
    }
}
