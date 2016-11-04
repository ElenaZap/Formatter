import java.io.IOException;

/**
 * Created by elena on 04.11.16.
 */
public interface IFormat{
    char readFile() throws IOException;
    void writeFile() throws IOException;
}
