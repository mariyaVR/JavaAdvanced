import java.io.*;
import java.util.ArrayList;

public class SaveAnArrayListOfDoubles {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream outputStream = new ObjectOutputStream( new FileOutputStream(
                "resources/doubles.list"));
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(17.5);
        doubles.add(23.5);
        doubles.add(27.5);
        outputStream.writeObject(doubles);
        outputStream.flush();
        ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("resources/doubles.list"));
        System.out.println(inputStream.readObject());
        inputStream.close();
    }
}