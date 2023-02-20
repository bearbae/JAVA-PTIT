
import java.util.Scanner ; 


public class boinhonhatcuansonguyenduong {
     
    public static long gcd(long a,long b)
    {
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public static long lcm(long a, long b)
    {
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int t;
        t=sc.nextInt();
        while(t-->0)
        {
            long n;
            n=sc.nextLong();
            long res=1;
            for (long i=2;i<=n;i++)
            {
                res=lcm(res,i);
            }
            System.out.println(res);
        }
    }
}
