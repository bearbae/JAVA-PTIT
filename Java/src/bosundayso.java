
import java.util.Scanner;
import java.util.*; 

public class bosundayso {

    private static int INT_MAX;
     private static int INT_MIN;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int a[] = new int[200] ; 
        int l = 1 ; 
        int r = INT_MIN ; 
        for(int i = 1 ; i <= n ; i++)
        {
            int x = sc.nextInt() ; 
            l = Math.min(l,x) ;
            r = Math.max(r,x) ; 
            a[x]= 1 ; 
        }
        int ok = 0 ; 
        for(int i = l ; i <= r ; i++)
        {
            if(a[i] == 0){
                System.out.println(i);
                ok = 1 ; 
            }
           
                
        }
        if(ok == 0){
             System.out.println("Excellent!");
        }
    }
}
