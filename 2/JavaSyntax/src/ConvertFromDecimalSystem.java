import java.util.Scanner;

public class ConvertFromDecimalSystem {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Integer number = reader.nextInt();
        System.out.print(Integer.toString(number, 7));
    }
}
