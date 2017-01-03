import java.util.Scanner;

/**
 * Created by Mimeto on 3/21/2016.
 */
public class PrintCharacterTriangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of the rows:");
        int numberOfLines = reader.nextInt();
        triangleOfAlphabets(numberOfLines);
    }

    private static void triangleOfAlphabets(int numberOfLines){
        upperRows(numberOfLines);
        lowerRows(numberOfLines);
    }

    private static void lowerRows(int numberOfLines){
        for (int i = numberOfLines - 1; i > 0 ; i--) {
            printLineOfAlphabets(i);
        }
    }

    private static void upperRows(int numberOfLines){
        for (int i = 1; i <= numberOfLines; i++) {
            printLineOfAlphabets(i);
        }
    }

    public static void printLineOfAlphabets(int i) {
        for (char c = 'a'; c < 'a' + i; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
