import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by elena on 02.11.16.
 */
public class FormatterTest {
    @Test
    public void readFile() throws IOException {
        String text="import";

Formatter f= new Formatter();
File file= new File( "/home/elena/Desktop/Bred.txt");
        FileReader reader= new FileReader(file);
        System.out.println(text);
       Assert.assertEquals ((char)reader.read(), f.readFile());
    }




}
