
import java.util.Scanner;


public class phantichthuasonguyento {
    static void pt(int n ){
        for(int i = 2  ; i <= Math.sqrt(n) ; i++){
            if(n%i == 0 ){
         int cnt = 0 ; 
            while(n % i == 0 ){
                cnt++ ; 
                n/= i ; 
            }
            if(n == 1 ) System.out.println( i +"(" + cnt + ")" );
            else  System.out.print( i +"(" + cnt + ")" + " ");
            }
           
        }     
         if(n != 1 ) System.out.println(n+ "(1)");
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ;
        int j = 1 ; 
        while( j <= t){ 
            int n = sc.nextInt() ; 
           // if(n == 1 ) return ;
            System.out.print("Test " + j + ": ");
            pt(n) ; 
            j++ ; 
    }
    }
}
        
