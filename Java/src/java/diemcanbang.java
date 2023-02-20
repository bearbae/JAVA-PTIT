
import java.util.Scanner;


public class diemcanbang {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in) ; 
           int t = sc.nextInt() ; 
           while(t>0){
               int n = sc.nextInt() ; 
               int a[] = new int[n] ; 
               int sumr  = 0 ; 
               int suml = 0 ; 
               for(int i = 0 ; i < n ; i++){
                   a[i] = sc.nextInt() ; 
                   sumr += a[i] ; 
               }
              sumr -= a[0] ; 
              int res = -1 ; 
               for(int i = 1 ; i < n ; i++){
                   if(sumr == suml){
                       res = i ; 
                       break ; 
                   }
                   else{
                       sumr -= a[i] ; 
                       suml += a[i-1] ; 
                   }
               }
               System.out.println(res);
               t-=1; 
           }
         
    }
}
