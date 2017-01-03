import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String firstString = reader.next();
        String secondString = reader.next();
        Long sumOfMultipliedCharacters = multiplyingChracters(firstString, secondString);
        System.out.println(sumOfMultipliedCharacters);
    }

    private static Long multiplyingChracters(String firstString, String secondString) {
        Long sum = 0L;
        for (int i = 0; i < firstString.length(); i++) {
            sum += firstString.charAt(i) * secondString.charAt(i);
        }
        sum += calculatingTheRemainder(firstString, secondString);

        return sum;
    }

    private static Long calculatingTheRemainder(String firstString, String secondString) {
        Long sumOfRemainders = 0L;
        if (firstString.length() > secondString.length()){
            String remainder = firstString.substring(secondString.length());
            for (int i = 0; i < remainder.length(); i++) {
                sumOfRemainders += remainder.charAt(i);
            }
        }else if (firstString.length() < secondString.length()){
            String remainder = secondString.substring(firstString.length());
            for (int i = 0; i < remainder.length(); i++) {
                sumOfRemainders += remainder.charAt(i);
            }
        }
        return  sumOfRemainders;
    }
}
