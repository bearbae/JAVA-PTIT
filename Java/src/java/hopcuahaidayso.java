
import java.util.Scanner;
import java.util.Set ; 
import java.util.TreeSet ; 

/**
 *
 * @author Admin
 */
public class hopcuahaidayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
           int n = sc.nextInt() ;
           int m = sc.nextInt() ;
           Set<Integer> a  = new TreeSet<>() ; 
           Set<Integer> b  = new TreeSet<>() ;
           for(int i = 0 ; i < n ; i++){
               a.add(sc.nextInt()) ; 
           }
           for(int j =  0 ; j <  m ;j++){
               b.add(sc.nextInt()) ; 
           }
           for(int i : a){
               for(int j : b){
                   if(i == j ){
                       b.remove(j) ; 
                       break ; 
                   }
               }
           
           }
             a.addAll(b) ; 
             for(int i : a) {
                 System.out.print(i + " ") ;
             }
             System.out.println();
                 
    }
    
}
