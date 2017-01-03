import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] first = reader.nextLine().split("\\s+");
        String[] second = reader.nextLine().split("\\s+");
        ArrayList<Character> firstList = new ArrayList<Character>();
        ArrayList<Character> secondList = new ArrayList<Character>();
        for (String character : first ) {
            firstList.add(character.charAt(0));
        }

        for (String character : second) {
            secondList.add(character.charAt(0));
        }

        secondList.removeAll(firstList);
        firstList.addAll(secondList);
        for (Character letter : firstList){
            System.out.print(letter + " ");
        }
    }
}
