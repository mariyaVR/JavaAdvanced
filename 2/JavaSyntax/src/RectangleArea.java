import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstSide = reader.nextInt();
        int secondSide = reader.nextInt();
        int area = firstSide * secondSide;
        System.out.print(area);
    }
}
