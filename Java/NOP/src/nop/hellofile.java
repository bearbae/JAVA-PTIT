
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




/**
 *
 * @author LOVE
 */
public class hellofile {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("Hello.txt");
        Scanner scanner = new Scanner(file);
        String[] tu = new String[100];
        int i=0;
        while(scanner.hasNextLine())
        {
            String w=scanner.nextLine();
            System.out.println(w);
        }
 
    }  
}
