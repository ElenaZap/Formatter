import java.io.IOException;

/**
 * Interface for write
 */

interface IWriter {
    /**
     *
     * @param a char symbol
     * @throws IOException for write
     */
    void writeFile(char a) throws IOException;
}
