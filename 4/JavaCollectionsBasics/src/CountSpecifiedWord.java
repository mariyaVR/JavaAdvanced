import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] data = reader.nextLine().toLowerCase().split("[^a-zA-Z]+");
        String searchedWord = reader.nextLine();
        int counter = 0;
        for (String word : data){
            if (word.equals(searchedWord)){
                counter++;
            }
        }

        System.out.print(counter);
    }
}
