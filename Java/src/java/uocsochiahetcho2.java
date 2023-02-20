
import java.util.Scanner;


public class uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int  n = sc.nextInt() ; 
//            for(int i = 2 ; i <= n ; i++){
//                while(n%i == 0 ){
//                    if(i % 2 == 0 ) cnt++  ; 
//                    n/= i ; 
//                }
//            }
            int cnt = 0 ; 
              for(int i = 1 ; i <= Math.sqrt(n) ; i++){
                     if(n % i == 0 ){
                         if(i!= n/i && (n/i) % 2  == 0) cnt++ ; 
                         if(i % 2 == 0 ) cnt++ ; 
                     }
                     }
        
            System.out.println(cnt);
        }
    }
}
