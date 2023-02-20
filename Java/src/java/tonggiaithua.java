
import java.util.Scanner;


public class tonggiaithua {
    static long gt(int n ){
        long x =  1  ; 
         long sum = 0 ; 
        for(int i = 1 ;  i <= n ; i++){
            x  *= i ;
            sum += x ; 
             
            
        }
        return sum ; 
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        System.out.println(gt(n));
    } 
}
