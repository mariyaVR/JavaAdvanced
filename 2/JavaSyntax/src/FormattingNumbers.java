import com.google.common.base.Strings;
import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.ENGLISH);

        short firstNumber = reader.nextShort();
        float secongNumber = reader.nextFloat();
        float thirdNumber = reader.nextFloat();

        System.out.printf("|%-10x|%s|%10.2f|%-10.3f|", firstNumber,
                Strings.padStart(Integer.toBinaryString(firstNumber), 10, '0'),
                secongNumber, thirdNumber);
    }
}