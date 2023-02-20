
import java.util.Scanner;


public class giaiptb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
       int a = sc.nextInt() ; 
        int b = sc.nextInt() ; 
       float x = (float)-b/(float)a ; 
      if(a == 0 && b!= 0 ) System.out.println("VN");
      else if( a == 0 && b == 0) System.out.println("VSN"); 
      else System.out.printf("%.2f", x) ;
     
         
    }
}
