
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class rutgonxaukitu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb = new StringBuilder(s);
        boolean check=true;
        while(check)
        {
            check=false;
            for (int i=1;i<sb.length();i++)
            {
                if (sb.charAt(i)==sb.charAt(i-1))
                {
                    sb.delete(i-1, i+1);
                    check=true;
                }
            }
        }
        if (sb.length()>0) System.out.println(sb);
        else System.out.println("Empty String");
    }
}
