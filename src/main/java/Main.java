import java.io.IOException;

/**
 * Created by elena on 04.11.16.
 */
 public class Main {
    public static void main (final String[] args)  {
        Formatter formatter=  new Formatter();
        try {
            formatter.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            formatter.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
