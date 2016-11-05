import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reader read from file to char array;
 */
class ReaderF implements IReader{
    /**
     *
     * @return a char array
     * @throws IOException for read
     */
      @Override
    public char[] readFile() throws IOException {
        String fil = "Text.txt";
        File f=new File(fil);
        FileReader reader = new FileReader(f);

       final char[] a = new char[(int) f.length()];
        int c,i=0;
        while ((c = reader.read()) != -1) {
       a[i]=(char) c;
        i++;
        }
    return  a;
        }
}