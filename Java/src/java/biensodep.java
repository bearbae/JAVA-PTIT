
import java.util.*;


public class biensodep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String s = sc.nextLine() ; 
        ArrayList<String> a = new ArrayList<>() ; 
        for(int i = 5 ; i < s.length()  ; i++ ){
            a.add(String.valueOf(s.charAt(i))) ; 
        } 
        for( int i = 0 ;  i < a.size() ; i++ )
        {
            if(String(a.get(i)) == '.') a.remove(i) ; 
        }
        for (int i = 0 ; i < a.size() ; i++){
            System.out.println(a.get(i) );
        }

    }

    private static char String(String get) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

