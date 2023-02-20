
import java.math.BigInteger;

import java.util.Scanner;

public class hieusonguyenlon2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A,B;
        A=sc.next();
        B=sc.next();
        BigInteger a=new BigInteger(A);
        BigInteger b=new BigInteger(B);
        String k=(a.subtract(b).toString());
        System.out.println(k);
    }
}
