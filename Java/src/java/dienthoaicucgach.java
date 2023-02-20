

import java.util.ArrayList;
import java.util.Scanner;
public class dienthoaicucgach {
    public static boolean check(String s)
    {
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0)
        {
            String s=sc.next();
            String res="";
            for (int i=0;i<s.length();i++)
            {
                char tmp=s.charAt(i);
                if (Character.isLowerCase(tmp))
                {
                    tmp-=32;
                }
                if (tmp=='A'||tmp=='B'||tmp=='C') res+='2';
                else if (tmp=='D'||tmp=='E'||tmp=='F') res+='3';
                else if (tmp=='G'||tmp=='H'||tmp=='I') res+='4';
                else if (tmp=='J'||tmp=='K'||tmp=='L') res+='5';
                else if (tmp=='M'||tmp=='N'||tmp=='O') res+='6';
                else if (tmp=='P'||tmp=='Q'||tmp=='R'||tmp=='S') res+='7';
                else if (tmp=='T'||tmp=='U'||tmp=='V') res+='8';
                else res+='9';
            }
            if (check(res))
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}