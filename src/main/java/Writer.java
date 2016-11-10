import java.io.FileWriter;
import java.io.IOException;
/**
 * Writer write a symbol to file
 * Created by elena 11.11.16
 */
 class Writer implements IWriter {
    /**
     * @param a symbol char array
     */
    public void writeFile(final char a) {
        try {
            FileWriter f = new FileWriter("new.txt", true);
            f.write(a);
            f.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
 
