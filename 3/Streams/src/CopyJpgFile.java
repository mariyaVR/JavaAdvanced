import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgFile {
    public static void main(String[] args) throws IOException{
        FileInputStream fileReader = new FileInputStream("resources/rock.jpg");
        FileOutputStream fileWriter = new FileOutputStream("resources/coppyImage.jpg");

        byte[] buffer = new byte[4096];
        int readBytes;
        while (!((readBytes= fileReader.read(buffer,0, buffer.length))<= 0)){
            fileWriter.write(buffer, 0, readBytes);
        }
        fileReader.close();
        fileWriter.close();
    }
}
