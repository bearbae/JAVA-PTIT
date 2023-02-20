
import java.util.Scanner;


public class tonguocso1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        long sum  = 0 ; 
       while(n-->0){
          int m = sc.nextInt() ;
//            for(int i = 2 ; i <= Math.sqrt(m) ; i++){
//                if( m% i == 0 ){
//                    while(m % i == 0){
//                        sum += i ; 
//                       m /= i ; 
//                    }
//                }
//              
//            }
//              if(m != 1 ) sum += m ; 
           while(m % 2 ==0 ) {
                      sum += 2 ; 
                      m /= 2 ; 
                  }
              for(int i =3 ; i*i <= m ; i+=2 ){
                  while(m % i ==0 ) {
                      sum += i ; 
                      m /= i ; 
                  }
              }
              
             if(m > 1) sum += m ; 
        }
        System.out.println(sum);
        sc.close();
    }
        
}
