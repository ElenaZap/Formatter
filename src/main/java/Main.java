import java.io.IOException;

/**
 * Main class
 */
 public class Main {
    /**
     *
     * @param args string
     * @throws IOException error read
     */
    public static void main (final String[] args) throws IOException {

            Formatter formatter=  new Formatter();

        ReaderF reader=new ReaderF();
        reader.readFile();
        formatter.formatte(reader.readFile());

}
 }
