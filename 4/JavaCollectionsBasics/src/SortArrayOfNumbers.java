import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Integer count = Integer.parseInt(reader.nextLine());
        Integer[] array = new Integer[count];

        for (int i = 0; i < array.length; i++){
            array[i] = reader.nextInt();
        }

        Arrays.sort(array);
        for (int el : array){
            System.out.print(el + " ");
        }
    }
}