import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] data = reader.nextLine().split("[^a-zA-Z]+");
        System.out.print(data.length);
    }
}