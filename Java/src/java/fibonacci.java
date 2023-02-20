
import java.util.Scanner;


public class fibonacci {
   
    static int Fibo(int n){
          if(n < 3 ) return 1 ; 
          return ( Fibo(n-2) + Fibo(n-1)) ; 
             
          }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in) ; 
    int t  = sc.nextInt() ;
        while(t-->0){
            int n = sc.nextInt() ; 
            long x = Fibo(n) ; 
            System.out.println(x); 
    }
 
}
}
