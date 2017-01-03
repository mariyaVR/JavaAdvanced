import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersfromNToM {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Integer a = reader.nextInt();
        Integer b = reader.nextInt();
        Integer minimum = Math.min(a, b);
        Integer maximum = Math.max(a, b);
        List<Integer> randomizedNumbers = new ArrayList<>();
        randomizeNumbers(minimum, maximum, randomizedNumbers);
        System.out.println(Joiner.on(' ').join(randomizedNumbers));
    }

    private static void randomizeNumbers(Integer minimum, Integer maximum, List<Integer> randomizedNumbers) {
        Random randomGenerator = new Random();
        for (int i = 0; i <= maximum - minimum ; i++) {
            Integer randomNumber = randomGenerator.nextInt(maximum - minimum + 1) + minimum;
            while (randomizedNumbers.contains(randomNumber)){
                randomNumber = randomGenerator.nextInt(maximum - minimum + 1) + minimum;
            }
            randomizedNumbers.add(randomNumber);
        }
    }
}
