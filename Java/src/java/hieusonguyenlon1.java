

import java.math.BigInteger;
import java.util.Scanner;

public class hieusonguyenlon1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0)
        {
            String A,B;
            int x;
            A=sc.next();
            B=sc.next();
            BigInteger a=new BigInteger(A);
            BigInteger b=new BigInteger(B);
            String k=(a.subtract(b).abs().toString());
            if (A.length()>B.length()) x=A.length();
            else x=B.length();
            while (k.length()<x)
            {
                k='0'+k;
            }
            System.out.println(k);
        }
    }
}