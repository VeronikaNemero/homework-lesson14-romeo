import java.io.FileReader;
import java.io.IOException;

public class TextReader {
    public String readText(){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("Romeo and Juliet.txt");
            int k;
            while ((k = fileReader.read()) != -1) {
                stringBuilder.append((char) k);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FindMaximal.max(stringBuilder.toString());
    }
}
