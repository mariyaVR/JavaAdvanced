import java.util.*;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> words = new LinkedList<>(Arrays.asList(reader.nextLine().split(" ")));

        while (words.size()> 0){
            String word = words.get(0);
            words.stream().filter(s -> s.equals(word)).forEach(s -> System.out.print(s + " "));
            System.out.println();
            words.removeAll(Collections.singleton(word));
        }
    }
}
