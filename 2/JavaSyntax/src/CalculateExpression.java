import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float a = reader.nextFloat();
        float b = reader.nextFloat();
        float c = reader.nextFloat();
        reader.useLocale(Locale.ENGLISH);
        float firstFormulaResult = (float)Math.pow(((a * a + b * b) / (a * a - b * b)), ((a + b + c) / Math.sqrt(c)));
        float secondFormulaResult = (float) Math.pow((a * a + b * b - c * c * c), (a - b));
        float averageOfNumbers = (a + b + c) / 3;
        float averageOfFormulas = (firstFormulaResult + secondFormulaResult) / 2;
        float differenceBetweenAverage = Math.abs(averageOfNumbers - averageOfFormulas);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstFormulaResult, secondFormulaResult, differenceBetweenAverage);
    }
}
