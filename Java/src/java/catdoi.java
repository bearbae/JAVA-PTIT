


import java.util.Scanner ; 
public class catdoi {
    static char cut(char x ){
        if( x == '0' || x == '8' || x == '9') return '0' ;
        if( x == '1') return '1' ;
        return '-' ;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        sc.nextLine() ;
                
        while(t-->0){
            String s = sc.nextLine() ; 
            boolean ktra  = true ; 
            boolean problem = true ; 
            int check = 1 ;
            for(int i = 0 ; i < s.length() ; i++){
                 char x = cut(s.charAt(i)) ; 
                 if(x != '-'){
                     if(ktra && x == '1'){
                         ktra = false ; 
                     }
                     if(!ktra){
                         System.out.print(x);
                         problem = false ; 
                     } 
                }
                 else{
                     check = 0 ; 
                     break ;
                 }
        }
            if(problem || check == 0) System.out.println("INVALID");
            System.out.println();
           
        }
    }
    
}
