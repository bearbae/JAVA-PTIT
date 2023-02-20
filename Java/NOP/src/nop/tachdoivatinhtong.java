

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class tachdoivatinhtong  {
    public static void main(String[] args)throws FileNotFoundException {
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        String s=sc.next();
        while (s.length()!=1){
            String x1=s.substring(0, s.length()/2);
            String x2=s.substring( s.length()/2,s.length());
            BigInteger a=new BigInteger(x1);
            BigInteger b=new BigInteger(x2);
            System.out.println(a.add(b));
            s=a.add(b).toString();
        }
    }
}
