import java.util.Scanner;
import java.util.* ;

public class thugondayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        ArrayList<Integer> array = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            array.add(sc.nextInt()) ; 
        }
        boolean ok = true ; 
        while(ok){
            ok = false ; 
            for(int i = 0 ; i < array.size() -1 ; i++)
            {
                if((array.get(i) + array.get(i+1)) % 2 == 0 )
                 {
                     array.remove(i) ; 
                    array.remove(i) ; 
                    ok = true ; 
                    
                 }
            }
            
        }
        System.out.println(array.size());
    }
}