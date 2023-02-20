
import java.util.Scanner;
public class bosungdayso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int []a=new int[n+5];
        int []b=new int[205];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[a[i]]++;
        }
        boolean check=false;
        for (int i=1;i<=a[n-1];i++)
        {
            if(b[i]==0)
            {
                System.out.println(i);
                check=true;
            }
        }
        if (check==false)
        {
            System.out.println("Excellent!");
        }
    }
}
