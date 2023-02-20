
import java.util.Scanner;


public class fibonaacikgongdequy {
   static long Fibon(int n ){
       if(n == 1 || n == 2 ) return 1 ; 
       long a = 0 ,  a1 = 1 , a2 = 1 ; 
       for(int i = 3 ; i <= n ; i++){
           a = a1 + a2 ; 
           a1 = a2 ; 
           a2 = a  ; 
       }
       return  a  ; 
       
   }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-->0){
            
        int n = sc.nextInt() ; 
           
//            if(n == 1 ) System.out.println("1");
//            if(n >= 2){
//                 long   f0 = 0 , f1 = 1 ; 
//                 long m ; 
//               for(int i = 2 ; i <= n ;i++){
//                   m = f0 + f1 ; 
//                   f0 = f1 ; 
//                   f1  = m  ; 
//               }
                 System.out.println( +Fibon(n));
            }
          
    }

    }

