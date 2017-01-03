import java.util.Scanner;

/**
 * Created by Mimeto on 3/21/2016.
 */
public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        int sum = CalculateSum(number);
        System.out.print(sum);
    }

    public static int CalculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
