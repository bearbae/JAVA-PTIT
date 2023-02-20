import java.util.Scanner ; 
public class mangdoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t  = sc.nextInt() ; 
        while(t-->0){
            int n = sc.nextInt()  ; 
            int a[] = new int[n] ; 
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt() ; 
            }
            int check = 1 ; 
            int l = 0 , r = n-1 ; 
            while(l < r ){
                if(a[l] != a[r]){
                    check = 0 ;
                    break ; 
                }
                l++ ; 
                r-- ; 
            }
            if(check == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
