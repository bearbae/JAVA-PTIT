
import java.util.Scanner;


public class daotu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        int t  =  sc.nextInt() ; 
        sc.nextLine() ; 
        while(t-->0)
        {
            String s = sc.nextLine() ;
            String tmp[] = s.split(" ");
            s = "" ; 
            for(int i = 0  ; i < tmp.length ; i++ ){
                for(int j = tmp[i].length()-1 ; j >=0 ; j--){
                    s += tmp[i].charAt(j) ; 
                }
                s += " " ; 
            }
            System.out.println(s);
        }
    }
}
