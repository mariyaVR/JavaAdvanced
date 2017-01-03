import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/TextFile"));

        String line = bufferedReader.readLine();
        while (line != null){
            int sum = line.chars().sum();
            System.out.println(sum);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
