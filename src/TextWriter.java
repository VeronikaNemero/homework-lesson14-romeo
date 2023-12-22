import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {

    public static void writer(String reader){
        try {
            FileWriter pw = new FileWriter("The longest word.txt");
            pw.write(reader.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
