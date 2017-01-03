import java.util.*;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> strings = new LinkedList<>(Arrays.asList(reader.nextLine().split(" ")));

        String stringWithMostOccurences = " ";
        int longestCount = 0;
        while (strings.size()> 0){
            String word = strings.get(0);
            long countOccurences = strings.stream().filter(s-> s.equals(word)).count();

            if (countOccurences > longestCount){
                longestCount = (int)countOccurences;
                stringWithMostOccurences = word;
            }

            strings.removeAll(Collections.singleton(word));
        }

        for (int i = 0; i < longestCount; i++){
            System.out.print(stringWithMostOccurences + " ");
        }
    }
}
