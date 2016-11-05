import java.io.IOException;

/**
 * Interface for read
 */
interface IReader {
        /**
         *
         * @return a char array
         * @throws IOException for read
         */
        char[] readFile() throws IOException;

}
