import java.io.FileWriter;
import java.io.IOException;

/**
 * Writer write a symbol to file
 */
 class Writer implements IWriter {
    /**
     * @param a symbol char array
     *
     */
    public void writeFile(char a) {
        try {
            FileWriter f = new FileWriter("new.txt", true);
            f.write(a);
            f.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
