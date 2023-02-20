
import java.util.Scanner;
import java.util.* ; 

public class test {
    static boolean check(String s ){
        int ch = 0 ; 
             for(int i = 0 ; i < s.length()-1 ; i++)
             {
                if(Math.abs((s.charAt(i)-'0') - (s.charAt(i+1)- '0')) != 2 ){
                    ch = 1 ; 
                   break ; 
                }
            }
             if(ch == 1 ) return false ; 
             else  return true ; 
             
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ;
        sc.nextLine() ; 
        while(t-->0){
            String s = sc.nextLine() ; 
         if(check(s))
        {
            int sum  = 0 ; 
        
            for(int i = 0 ; i < s.length() ; i++)
            {
                sum += s.charAt(i) - '0' ; 
            }
            if(sum % 10 == 0 ) System.out.println("YES");
            else System.out.println("NO");
         }
         else System.out.println("NO");
}
}
}
