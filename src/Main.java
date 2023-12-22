import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        TextReader textReader = new TextReader();
        TextWriter.writer(textReader.readText());
    }
}