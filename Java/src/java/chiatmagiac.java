
import java.util.Scanner ; 
public class chiatmagiac {
    static double dientich(int i , double n , double h ){
        return h*Math.sqrt(i/n) ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t>0 ){
            double n = sc.nextDouble() ; 
            double h = sc.nextDouble() ; 
            for(int i = 1 ; i < n ; i++){
            double x = dientich(i,n,h) ; 
                System.out.printf(String.format("%.6f " , x));
            }
                t-- ; 
               System.out.println(); 
    }
        sc.close();
}
}
    
