import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Test for read and write
*/
public class FormatterTest {
    @Test
    public void readFile() throws IOException {
        String text="import java.util.Scanner; public class KvadratnoeUravnenie " +
                "{public static void main(String[] args) " +
                "{Scanner in = new Scanner(System.in);}\n";
        ReaderF reader =new ReaderF();
        System.out.println(text);
       Assert.assertEquals (text,new String (reader.readFile()));
    }

     @Test
    public void writeFile() throws IOException{
       String text="import java.util.Scanner;\n" +
               " public class KvadratnoeUravnenie {\n" +
               "    public static void main(String[] args) {\n" +
               "        Scanner in = new Scanner(System.in);\n" +
               "        }\n" +
               "        \n" +
               "        ";
         File file= new File( "new.txt");
         FileReader reader= new FileReader(file);
         char [] a=new char[ (int)file.length()];
         reader.read(a);
        Assert.assertEquals(text, new String (a));
    }
}
