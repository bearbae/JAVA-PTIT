import java.util.Scanner ; 

public class boichungnhonhat {
    static long ucln(long a , long b){
        while( a!= b){
            if( a > b) a = a-b ;
            else b = b-a ; 
            
        }
        return a ; 
    }
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in) ; 
    int t = sc.nextInt() ; 
    while(t-->0){
        long a = sc.nextLong() ;
        long b  =sc.nextLong() ;
            System.out.println((a*b)/ucln(a,b));
            
}
}
}
