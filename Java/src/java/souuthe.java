

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
public class souuthe{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0)
        {
            String s=sc.next();
            int dc=0,dl=0;
            boolean check=true;
            for (int i=0;i<s.length();i++)
            {
                if (s.charAt(i)=='0'||s.charAt(i)=='2'||s.charAt(i)=='4'||s.charAt(i)=='6'||s.charAt(i)=='8')
                {
                    dc++;
                }
                else if (s.charAt(i)=='1'||s.charAt(i)=='3'||s.charAt(i)=='5'||s.charAt(i)=='7'||s.charAt(i)=='9')
                {
                    dl++;
                }
                else 
                {
                    check=false;
                    break;
                }
            }
            if (check==false) System.out.println("INVALID");
            else
            {
                if (dl>dc&&s.length()%2!=0) System.out.println("YES");
                else if (dc>dl &&s.length()%2==0)System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}