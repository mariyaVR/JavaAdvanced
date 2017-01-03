import java.util.*;
import java.util.stream.Collectors;

public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> inputList = new LinkedList<>(Arrays.asList(reader.nextLine().split(" ")));
        String command = reader.nextLine();
        List<Integer> integerList = inputList.stream()
                .map(Integer::valueOf).collect(Collectors.toList());

        if (command.equals("Ascending")){
            integerList.stream()
                    .sorted((e1, e2) -> Integer.compare(e1, e2))
                    .forEach(e -> System.out.print(e + " "));
        }
        else{
            integerList.stream()
                    .sorted((e1, e2) -> Integer.compare(e2, e1))
                    .forEach(e -> System.out.print(e + " "));
        }
    }
}
