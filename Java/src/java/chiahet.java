
import java.math.BigInteger;
import java.util.*;


public class chiahet {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        int t = sc.nextInt() ; 
        while(t-->0){
            BigInteger n = sc.nextBigInteger() ; 
             BigInteger m = sc.nextBigInteger() ; 
             BigInteger k = new BigInteger("0") ; 
             BigInteger res = n.mod(m) ; 
              BigInteger res1 = m.mod(n) ; 
            if( res.equals(k)   || res1.equals(k)) System.out.println("YES");
            else System.out.println("NO");
             
        }
    }
}
