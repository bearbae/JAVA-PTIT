
import java.util.Scanner;


public class solienke {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-->0){ 
           long n = sc.nextLong();
           int check  = 0 ; 
           long a  = n%10 ; 
           n/= 10 ; 
           while(n > 0){
               long b = n % 10 ; 
               if(Math.abs(a-b) != 1 ) check = 1 ; 
               a = b ; 
               n /= 10 ; 
           }
          
           if(check == 1 ) System.out.println("NO");
           else System.out.println("YES");
        }
           
    }
}
