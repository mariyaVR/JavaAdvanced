import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Matcher matcher = Pattern.compile("([a-zA-Z]+)").matcher(reader.nextLine());
        TreeSet uniqueWords = new TreeSet();
        String foundWord;
        while (matcher.find()){
            foundWord = matcher.group(1);
            uniqueWords.add(foundWord.toLowerCase());
        }

        uniqueWords.stream().forEach(element -> System.out.print(element + " "));
    }
}
