import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}