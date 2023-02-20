
import java.util.Scanner;


public class xaudoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while(t-->0)
        {
            String s = sc.nextLine() ; 
            int l = 0 , r = s.length() - 1 ; 
            int check = 0 ;
            while(l <= r)
            {
                if(s.charAt(l) != s.charAt(r))
                {
                    check ++ ;
                    
                }
                l++ ; 
                r-- ; 
            }
            if(check == 0 && s.length() % 2 == 0) System.out.println("NO"); 
            else if(check <= 1) System.out.println("YES");
            else System.out.println("NO");
         }
    }
}
