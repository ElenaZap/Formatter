import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This is main class of formatter
 * Created by elena on 27.10.16.
 */
public class Formatter {
    /**
     * this is main
     * @param args string
     */

    public static void main(final String [] args)  {
        try (FileReader reader = new FileReader("/home/elena/Desktop/HW.java")) {
            try (FileWriter writer = new FileWriter("/home/elena/Desktop/HellW.java", false)) {

                int c, i;
                int v = 0, k = 0;

                while ((c = reader.read()) != -1) {
                    //System.out.print((char) c);
                    writer.write((char) c);
                    if (c == '\n') {
                        for (i = 0; i < v; i++) {
                            writer.write(" ");
                        }
                    }
                    if (c == ';') {
                        System.out.print("\n");
                        writer.write("\n");
                        for (i = 0; i < v; i++) {
                            writer.write(" ");
                        }

                    }
                    if (c == '}') {
                        writer.write("\n");
                        for (i = 0; i < k; i++) {
                            writer.write(" ");
                        }
                        k -= 4;
                    }
                    if (c == '{') {
                        v += 4;
                        k = v;
                        writer.write("\n");
                        for (i = 0; i < v; i++) {
                            writer.write(" ");
                        }

                    }

                }
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
 }
 }

