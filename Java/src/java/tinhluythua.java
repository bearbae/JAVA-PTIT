import java.util.Scanner;

public class  tinhluythua{
    public static final int m = (int)1e9 + 7;  

    static long power(long x, long y) {
        if (y == 0) return 1;
        long temp = power(x, y/2);
        long result = (temp%m * temp%m) %m;
        if (y%2 == 0)
            return result;
        else
            return (x*result)%m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) break;


            System.out.println(power(a, b));
        }
        sc.close();
    }
}
