
import java.util.Scanner;

    
public class lietketohop {
    int ok = 0 ; 
    static void ktao(int k , int a[] ){
        // int a[] = new int[100] ; 
        for(int i = 1 ; i  <= k ; i++)
        {
            a[i] = i ; 
        }
    }
   
    static void sinh(int n, int k,int a[]){
        int ok = 0 ; 
        // int a[] = new int[100] ; 
        int i = k ; 
        while(i >= 1 && a[i] == n-k+i)
        {
            i-- ; 
        }
        if(i == 0) ok = 1  ;
        else
        {
            a[i]+= 1 ; 
            for(int j = i+1 ;j <= k ;j++)
            {
                a[j] = a[j-1] +1  ;
            }
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int k = sc.nextInt() ; 
        int a[] = new int[k] ; 
        int ok = 0 ; 
        int cnt = 0 ; 
        ktao(k,a) ;
        while(ok == 1 ){
            for(int i = 1 ; i <= k ; i++)
            {
                System.out.println(a[i] + " " );
            }
            cnt+= 1 ; 
            sinh(n,k,a) ; 
        }
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
