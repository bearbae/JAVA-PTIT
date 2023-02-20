
import java.util.Scanner;


public class sodep34 {
    public static boolean check(int n ){
        if(n < 2) return false ; 
        else 
        {
            for(int i = 2 ; i < n ; i++)
                if(n % 2 == 0) return false ; 
        }
       
        return true ; 
    }
    public static boolean ktra(String s ){
        for(int i = 0 ; i < s.length() ; i++){
            if(check(s.charAt(i)-'0') == false) return false ; 
         if (s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while(t --> 0){
            int check = 1 ; 
            String s  = sc.nextLine() ; 
//            for(int i = 0 ; i < s.length() ; i++){
//                if(check(s.charAt(i)-'0') == false){
//                    check = 0 ; 
//                    break ; 
//                }
//            }
            if(ktra(s) ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
