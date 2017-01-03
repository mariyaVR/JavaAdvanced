import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String word = scanner.nextLine().toLowerCase();

        Pattern lookFor = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = lookFor.matcher(input);
        int wordCount = 0;
        while (matcher.find()){
            wordCount++;
        }

        System.out.println(wordCount);
    }
}