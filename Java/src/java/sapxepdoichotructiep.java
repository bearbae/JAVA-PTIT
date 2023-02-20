
import java.util.Scanner;


public class sapxepdoichotructiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int a[] = new int[n] ; 
        for(int i = 0 ; i <  n ; i++){
            a[i] = sc.nextInt() ; 
        }
        for(int i = 0 ; i < n-1 ; i++){
            int cnt = i+1 ; 
            for(int j = i+1 ; j < n ; j++){
                if(a[i] > a[j] ) {
                    int temp = a[i] ; 
                    a[i] = a[j] ; 
                    a[j] = temp  ; 
                }
            }  
              System.out.print("Buoc " +cnt+ ": ");
                for(int k = 0 ; k < n ; k++){
                    System.out.print(a[k] + " " );
                }
            
                System.out.println(); 
            }
        }
        
    }

   

