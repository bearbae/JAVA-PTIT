import java.util.Locale;
import java.util.Scanner;

public class uocchunglonnhatcuasonguyentolon {
    static long gcd(long reducedN, long b) {
        return b == 0 ? reducedN : gcd(b, reducedN%b);
    }
    static long reducedN(long a, String b) {
        long res = 0;
        for (int i=0; i<b.length(); i++) {
            res = (res*10 + b.charAt(i) - '0') % a;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t>0) {
            long n1 = sc.nextLong();
            String n2 = sc.next();
            System.out.println(gcd(reducedN(n1,n2), n1));
            t-=1;
        }
        sc.close();
    }
}
