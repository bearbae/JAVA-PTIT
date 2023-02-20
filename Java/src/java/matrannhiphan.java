
import java.util.Scanner;


public class matrannhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int[] a = new int[n+2] ; 
//        for(int i = 0 ; i < n ; i++)
//        {
//            for(int j = 0 ; j < 3 ; j++)
//            {
//                a[i][j] = sc.nextInt() ; 
//                
//            }
//        }
        int cnt = 0 ; 
        for(int i = 0 ; i < n ; i++)
        {
            
            int check = 0 ; 
             for(int j = 0 ; j < 3 ; j++)
             {
                 a[i] = sc.nextInt() ; 
                 if(a[i] == 1)
                   {
                   check ++  ;
               }  
            }
             if(check > 1) cnt++ ; 
        
     }
        System.out.println(cnt);
}
}
