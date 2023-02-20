
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




/**
 *
 * @author LOVE
 */
public class hinhvuong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int x1,x2,a1,a2;
        int y1,y2,b1,b2;
        x1=sc.nextInt();
        x2=sc.nextInt();
        a1=sc.nextInt();
        a2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
        b1=sc.nextInt();
        b2=sc.nextInt();
        int res=Math.max(a1,b1)-Math.min(x1,y1);
        int tmp=Math.max(a2,b2)-Math.min(x2,y2);
        System.out.println(Math.max(res, tmp)*Math.max(res,tmp));
    }  
}
