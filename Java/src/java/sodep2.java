
import java.util.Scanner;


public class sodep2 {
     
    public static boolean check(String s ){
          if(s.charAt(0) != '8' || s.charAt(s.length()-1) != '8') return false ; 
          int sum = 0 ; 
        for(int i = 0  ; i < s.length() ; i ++){
             //  sum += s.charAt(i)-'0' ; 
               sum += Integer.parseInt(String.valueOf(s.charAt(i))) ; 
        }
        if(sum % 10 != 0 ) return false ; 
          return true ; 
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while(t--> 0){
         
            String s = sc.nextLine() ;
           
       
            
            if(check(s) ) System.out.println("YES");
            else System.out.println("NO");
            
        }
}
}