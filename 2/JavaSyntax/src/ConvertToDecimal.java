import java.util.Scanner;

public class ConvertToDecimal {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String number = reader.next();
        Integer result = Integer.valueOf(number, 7);
        System.out.println(result);
    }
}