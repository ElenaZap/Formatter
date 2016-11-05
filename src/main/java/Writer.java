import java.io.FileWriter;
import java.io.IOException;

/**
 * Writer write a symbol to file
 */
 class Writer implements IWriter {
    /**
     *
     * @param a symbol char array
     * @throws IOException for write
     */
        public void writeFile(char a) throws IOException {
            FileWriter f = new FileWriter("new.txt",true);
            f.write(a);
            f.flush();
        }


}
