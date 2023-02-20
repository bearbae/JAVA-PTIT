
import java.util.Scanner;


public class ucnnbcnn {
    static long ucln(long a , long b ){
        while( a!= b) {
            if(a > b ) a = a - b ; 
            else b = b-a ; 
        }
        return a ; 
    
}
    static long bcnn(long a , long b ){ 
        long cmp = ucln(a,b) ; 
        return (a*b)/cmp ; 
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in) ; 
        int t  = sc.nextInt() ;
        while(t--> 0 ){
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;
        System.out.println( bcnn(a,b) + " " + ucln(a,b));
    }
    }
}