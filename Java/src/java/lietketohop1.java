
import java.util.Scanner;
public class lietketohop1 
{
public static int dem=0;
public static void xuat(int a[], int k) {
        for (int i = 1; i <= k; i++) {
               System.out.print(a[i]+" ");
        }
        dem++;
        System.out.println();
}
    public static void tao(int a[],int k)
    {
        for (int i=1;i<=k;i++)
        {
            a[i]=i;
        }
    }
    public static void Try(int a[], int n, int k, int i) {
        for (int j = a[i - 1] + 1; j <= (n - k + i); j++) {
               a[i] = j;
               if (i == k)
                     xuat(a, k);
               else
                     Try(a, n, k, i + 1);
        }
 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []a=new int [1000000];
        Try(a,n,k,1);
        System.out.println("Tong cong co "+dem+" to hop");
    }
}
