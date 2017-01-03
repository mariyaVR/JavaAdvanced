import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Integer number = Integer.parseInt(reader.nextLine());
        long factorialSum = factorial(number);
        System.out.print(factorialSum);
    }

    private static long factorial(Integer number) {
        if(number == 0){
            return  1;
        } else {
            return number * factorial(number - 1);
        }
    }
}