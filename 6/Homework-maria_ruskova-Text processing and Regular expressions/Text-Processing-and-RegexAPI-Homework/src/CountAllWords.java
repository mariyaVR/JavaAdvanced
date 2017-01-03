import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = Arrays.asList(scanner.nextLine()
                .split("\\W"))
                .stream().filter(s -> !s.isEmpty())
                .collect(Collectors.toList())
                .toArray(new String[0]);
        int wordsCount = inputArray.length;
        System.out.println(wordsCount);
    }
}