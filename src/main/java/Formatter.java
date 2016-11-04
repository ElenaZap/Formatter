import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * This is main class of formatter
 * Created by elena on 27.10.16.
 */
public class Formatter implements IFormat {
    /**
     * this is main
     * @param args string
     */
    private static List<Character> chars = new ArrayList<>();




    @Override
    public char readFile() throws IOException{
        String fil = "/home/elena/Desktop/Bred.txt";
        File f=new File(fil);
                FileReader reader = new FileReader(f);

        final char[] a = new char[(int) f.length()];
                int c,i=0;
                    while ((c = reader.read()) != -1) {
                    //System.out.print((char) c);
                    chars.add((char) c);


                }


                return  (char) reader.read();
    }

    @Override
    public void writeFile() throws IOException{
        try (FileWriter writer = new FileWriter("/home/elena/Desktop/HellW.java", false)) {

            int  i,j;
            int v = 0, k = 0;
            int s=chars.size();
            for( j=0;j<s;j++){
                System.out.print(chars.get(j));
                writer.write( chars.get(j));
                if (chars.get(j) == '\n') {
                    for (i = 0; i < v; i++) {
                        writer.write(" ");
                    }
                }
                if (chars.get(j) == ';') {
                    System.out.print("\n");
                    writer.write("\n");
                    for (i = 0; i < v; i++) {
                        writer.write(" ");
                    }

                }
                if (chars.get(j) == '}') {
                    writer.write("\n");
                    for (i = 0; i < k; i++) {
                        writer.write(" ");
                    }
                    k -= 4;
                }
                if (chars.get(j)== '{') {
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
    }


      }




