
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectAccess obj = new Proxy("Patterns_DZ_5/resources/secret.txt");
        File file = obj.access();
        FileInputStream inStream = new FileInputStream(file);
        int i;
        while((i=inStream.read()) != -1)
        {
            System.out.print((char)i);
        }
        inStream.close();
    }
}