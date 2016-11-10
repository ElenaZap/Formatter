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
     * this is formatter
     *
     * @param a   char array
     *
     *
     */

    @Override
    public void formatte (char[] a) {
        /**
         * @param commentline comment in one line
         * @param comment     coment in /*...
         * @param kav         number of quotes
         */
        try {
            String fil = "Text.txt";
            File f = new File(fil);

            Writer wr = new Writer();
            FileWriter wri = new FileWriter("new.txt", false);
            int i, j;
            int commentline = 0, comment = 0, ignore = 0, kav = 0;
            int s = (int) f.length();
            int v = 0, k = 0;
            for (j = 0; j < s; j++) {
                if (a[j] == '/' && a[j + 1] == '*') comment = 1;
                if (a[j] == '*' && a[j + 1] == '/') comment = 0;
                wr.writeFile(a[j]);
                if (a[j] == '/' && a[j + 1] == '/') {
                    commentline = 1;
                }
                if (a[j] == '"' || a[j] == 39) {
                    kav += 1;
                    if (kav == 2) ignore = 0;
                    else ignore = 1;
                }
                if (a[j] == '\n') {
                    if (commentline == 1) commentline = 0;
                    for (i = 0; i < v; i++) {
                        wr.writeFile(' ');
                    }
                }
                if (a[j] == ';') {
                    if (commentline == 1 || a[j + 1] == '/' || comment == 1 || ignore == 1) {
                        commentline = 1;
                    } else {
                        System.out.print("\n");
                        wr.writeFile('\n');
                        for (i = 0; i < v; i++) {
                            wr.writeFile(' ');
                        }
                    }
                }
                if (a[j] == '}') {
                    if (commentline == 1 || a[j + 1] == '/' || comment == 1 || ignore == 1) {
                        commentline = 1;
                    } else {
                        wr.writeFile('\n');
                        for (i = 0; i < k; i++) {
                            wr.writeFile(' ');
                        }
                        k -= 4;
                    }
                }

                if (a[j] == '{') {
                    if (commentline == 1 || a[j + 1] == '/' || comment == 1 || ignore == 1) {
                        commentline = 1;
                    } else {
                        v += 4;
                        k = v;
                        wr.writeFile('\n');
                        for (i = 0; i < v; i++) {
                            wr.writeFile(' ');
                        }
                    }
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}




