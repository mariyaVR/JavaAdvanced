import java.util.Scanner;

public class SequencesOfEqualStrings2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] input = reader.nextLine().split("\\s+");
        System.out.print(input[0]);
        for (int i = 1; i < input.length; i++) {
            if (input[i].equals(input[i - 1]))
                System.out.print(" " + input[i]);
            else {
                System.out.println();
                System.out.print(input[i]);
            }
        }
    }
}