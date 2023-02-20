
import java.util.Scanner;
import java.util.* ; 
public class neww {
    static boolean check(String s ){
        if(s.charAt(0) == '8' && s.charAt(s.length()-1) == '8' ) return true ; 
        return false  ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ;
        sc.nextLine() ;
        
        while(t > 0) {
            
            String s = sc.nextLine() ; 
            int check = 1 ; 
            if(check(s)){
               
            int sum  = 0 ; 
            for(int i = 0 ; i < s.length() ; i++){
                sum +=  s.charAt(i)-'0' ;  
                }
            if(sum % 10 == 0 ) check = 0  ;
                    
        }
            if(check == 0 ) System.out.println("YES");
            else System.out.println("NO");
            t -= 1 ; 
    }
}
}
