import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/TextFile"));
        String fullText = "";
        String tempString;

        while ((tempString = bufferedReader.readLine()) != null) {
            fullText += tempString.toUpperCase() + "\r\n";
        }

        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("resources/FileOverwritten")));
        printWriter.write(fullText);
        printWriter.flush();
        bufferedReader.close();
        printWriter.close();
    }
}