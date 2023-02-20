
import java.util.*;


public class danhdauchucai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)  ;
        TreeSet<String> st = new TreeSet<>() ; 
        String s =sc.nextLine() ; 
        for(int i = 0  ; i < s.length() ; i++)
        {
            st.add(String.valueOf(s.charAt(i))) ; 
        }
        int cnt = 0 ; 
        for(String i : st){
            cnt++ ; 
        }
        System.out.println(cnt);
    }
}
