
import java.util.Scanner;


public class sapxepnoibot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ;
        int a[] = new int[n] ; 
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt() ; 
        }
        for(int i = 0 ; i <n-1 ; i++){
            int cnt = i+1 ; 
            int ok = 0 ; 
            for(int j= 0 ; j < n-i-1 ; j++){
                if(a[j] >  a[j+1]){
                    int temp = a[j] ; 
                    a[j] = a[j+1] ; 
                    a[j+1] = temp ; 
                    ok =1 ; 
                }
            }
            if( ok == 1 ){
            System.out.print("Buoc " + cnt + ": ");
            for(int k = 0 ; k < n ; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
            }
            else break ; 
        }
    }
}
