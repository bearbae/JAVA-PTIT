
import java.util.Scanner;


public class sodep1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while(t --> 0){
            String s = sc.nextLine()  ;
            int check = 1 ; 
            for(int i = 0 ;  i < s.length() ; i++)
            {
                if((int)s.charAt(i) % 2 != 0){
                    check = 0 ; 
                    break ; 
                }
            }
                if(check == 1 ) System.out.println("YES");
                else System.out.println("NO");
    }
}
}
