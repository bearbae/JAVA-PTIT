
import java.util.Scanner;


public class ktrafibonacci {
    
    static int fibo(long  m ){
        if(m == 0 || m == 1 ) return 1 ;
        long f1 = 0 , f2 = 1  ; 
       for(int i = 3 ; i <= 92 ; i++){
           long  fn = f1 + f2 ; 
           if(fn == m ) return 1 ; 
           f1 = f2 ; 
           f2 = fn  ; 
           
    }
       return 0 ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ; 
        while(t--> 0 ) {
            long n = sc.nextLong() ; 
           if(fibo(n) == 1 ) System.out.println("YES") ;
           else System.out.println("NO");
        }
     }
    }
        

   
