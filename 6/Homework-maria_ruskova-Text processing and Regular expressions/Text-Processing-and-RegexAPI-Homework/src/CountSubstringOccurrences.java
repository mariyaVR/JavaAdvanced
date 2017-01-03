import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine().toLowerCase();
        String substring = reader.nextLine().toLowerCase();

        Pattern lookFor = Pattern.compile(substring);
        Matcher matcher = lookFor.matcher(input);

        int substringCount = 0;
        boolean found = matcher.find();
        while (found){
            substringCount++;
            found = matcher.find(matcher.start() + 1);
        }

        System.out.println(substringCount);
    }
}
