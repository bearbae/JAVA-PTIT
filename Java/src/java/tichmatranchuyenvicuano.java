
import java.util.Scanner;
public class tichmatranchuyenvicuano {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k=1;k<=t;k++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int[n+5][m+5];
            int b[][]=new int[m+5][n+5];
            int c[][]=new int [n][n];
            for (int i=0;i<n;i++)
            {
                for (int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                    b[j][i]=a[i][j];
                }
            }
            System.out.println("Test "+k+":");
            for (int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                {
                    for (int x=0;x<m;x++)
                    {
                        c[i][j]+=a[i][x]*b[x][j];
                    }
                }
            }
            for (int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
