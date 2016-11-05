import java.io.File;

import java.io.FileWriter;
import java.io.IOException;



/**
 * Formatter read from a file to char array.
 *
 * Created by elena on 27.10.16.
 */
class Formatter implements IFormat {
    /**
     * this is main
     * @param a char array
     */

    @Override
    public void formatte(char[] a) throws IOException{
        String fil = "Text.txt";
        File f=new File(fil);
        Writer wr= new Writer();
        FileWriter wri= new FileWriter("new.txt",false);
        int i, j;
        int s = (int)f.length();
           int v = 0, k = 0;
           for (j = 0; j < s; j++) {
               wr.writeFile(a[j]);
               if (a[j] == '\n') {
                   for (i = 0; i < v; i++) {
                       wr.writeFile( ' ');
                   }
               }
               if (a[j] == ';') {
                   System.out.print("\n");
                   wr.writeFile('\n');
                   for (i = 0; i < v; i++) {
                      wr.writeFile(' ' );
                   }
               }
               if (a[j] == '}') {
                 wr.writeFile('\n');
                   for (i = 0; i < k; i++) {
                       wr.writeFile(' ');
                  }
                    k -= 4;
               }

               if (a[j]== '{') {
                   v += 4;
                   k = v;
                   wr.writeFile('\n');
                   for (i = 0; i < v; i++) {
                       wr.writeFile(' ' );
                  }
               }
            }

     }
}




