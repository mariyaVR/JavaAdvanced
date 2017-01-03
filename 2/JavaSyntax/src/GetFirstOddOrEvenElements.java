import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        String[] commands = scanner.nextLine().split(" ");
        executingCommand(commands, numbers);
    }

    private static void executingCommand(String[] commands, List<Integer> numbers) {
        String evenOrOdd = commands[2];
        int amountOfNumbers = Integer.parseInt(commands[1]);
        switch (evenOrOdd){
            case "even": getEvenNumbers(amountOfNumbers, numbers);
                break;
            case "odd": getOddNumbers(amountOfNumbers, numbers);
                break;
            default: System.out.println("Invalid command");
                break;
        }
    }

    private static void getOddNumbers(int amountOfNumbers, List<Integer> numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1){
                System.out.print(numbers.get(i) + " ");
                counter++;
            }
            if (counter >= amountOfNumbers){
                break;
            }
        }
    }

    private static void getEvenNumbers(int amountOfNumbers, List<Integer> numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0){
                System.out.print(numbers.get(i) + " ");
                counter++;
            }
            if (counter >= amountOfNumbers){
                break;
            }
        }
    }
}
