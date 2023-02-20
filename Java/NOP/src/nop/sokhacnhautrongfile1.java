import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class sokhacnhautrongfile1 {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        int a[]=new int [1000000];
        while (sc.hasNextLine()){
            String s[]=sc.nextLine().trim().split("\\s+");
            for (String x:s){
                a[Integer.parseInt(x)]++;
            }
        }
        for (int i=0;i<100000;i++){
            if (a[i]!=0){
                System.out.println(i+" "+a[i]);
            }
        }
    }
}
