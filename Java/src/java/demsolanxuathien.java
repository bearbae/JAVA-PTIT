
//import java.util.Scanner;
//import java.util.ArrayList ; 
import java.util.* ;

public class demsolanxuathien {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ; 
    int t = sc.nextInt() ; 
   int k = 1 ; 
    while(k <= t){
        int n = sc.nextInt() ; 
        ArrayList<Integer> a = new ArrayList<Integer>(n) ; 
         ArrayList<Integer> b = new ArrayList<Integer>() ; 
         for( int i = 0 ; i < n; i++ ){
             a.add(sc.nextInt()) ; 
         }
         for(int i : a){
             boolean check = true ;
             for(int j : b ){
                 if(j == i){
                     check = false ; 
                     break ; 
                 }
             }
             if(check) b.add(i) ; 
             
         }
         System.out.println("TEST " +k+": ");
         for(int j : b){
             //System.out.println("%d xuat hien %d lan" , m , Collections.frequency(a, m));
              //System.out.printf("%d xuat hien %d lan\n", j, Collections.frequency(a, j));
              System.out.println(j);
         }
         k+=1 ; 
          
}
}
}

    
           

