import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println(Files.readString(Paths.get(System.getProperty("user.home") + "config.txt")));
    }
}
