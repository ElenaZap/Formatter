import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reader read from file to char array;
 */
class ReaderF implements IReader {
    /**
     *
     * @return a char array
     *
     */
      @Override
    public char[] readFile()  {

          try {
              String fil = "Text.txt";
              File f = new File(fil);
              FileReader reader = new FileReader(f);
              char[] a = new char[(int)f.length()];
              int c, i = 0;
              while ((c = reader.read()) != -1) {
                  a[i] = (char) c;
                  i++;
              }
              return a;
          } catch (IOException e) {
              System.out.print(e.getMessage());
          }
          return "error".toCharArray();
      }
}