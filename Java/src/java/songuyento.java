
import java.util.Scanner;


public class songuyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t--> 0){
            int check = 0 ; 
            long n = sc.nextLong() ;
            for(int i = 2 ; i <= n-1 ; i++){
                if(n % i == 0 ) {
                    check = 1 ; 
                    break ; 
                } 
            }
            if(check == 1 ) System.out.println("NO");
            else System.out.println("YES"); 
        }
            
            
    }
}
