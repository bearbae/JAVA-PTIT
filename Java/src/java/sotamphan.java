
import java.util.Scanner;


public class sotamphan {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in) ; 
        int t  = sc.nextInt() ; 
        sc.nextLine() ; 
        while(t-->0){
            String chuoi ;
            chuoi = sc.nextLine() ; 
            int check = 1 ; 
            for(int i = 0 ; i < chuoi.length() ; i++){
                if(chuoi.charAt(i) != '0' &&  chuoi.charAt(i) != '1' && chuoi.charAt(i) != '2' ){
                    check = 0 ; 
                    break ; 
                }
            }
            if(check == 0) 
                System.out.println("NO");
            else 
                System.out.println("YES");
 
}
}
}
