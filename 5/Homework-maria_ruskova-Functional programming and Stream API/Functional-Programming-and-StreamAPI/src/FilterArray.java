import java.util.*;

public class FilterArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] input = reader.nextLine().split(" ");
        Arrays.stream(input).filter(el -> el.length() > 3).forEach(e -> System.out.print(e + " "));
    }
}
