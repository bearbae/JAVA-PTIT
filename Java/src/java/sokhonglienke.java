
import java.util.Scanner;


public class sokhonglienke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-->0){
            long n  = sc.nextLong() ; 
            
            long a = n % 10 ; 
             n /= 10 ;
             long sum  = a ; 
             int check  = 1  ; 
            while(n > 0 ){
                long d  = n % 10 ; 
                sum += d  ;
                if(Math.abs(a-d)!= 2 ) check = 0  ; 
                a = d ; 
                n /= 10 ; 
            }
            if(check == 1 && sum %10 == 0 ) System.out.println("YES");
            else System.out.println("NO");
    
        } 
    }
}
        

