
import java.util.Scanner;


public class chuso4va7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        long n = sc.nextLong() ; 
          int cnt = 0 ; 
          while(n > 10){
           long d = n%10 ; 
            if(d == 4 || d == 7) cnt++ ; 
            n /= 10 ; 
        }
        if( n == 4 || n == 7 ) cnt++ ; 
        if(cnt == 4 || cnt == 7 ) System.out.println("YES");
        else System.out.println("NO");
    }
}
