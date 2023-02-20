
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class tinhtong
{
    public static boolean check(String s){
        if(s.length()==0 ) return false;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))==false) return false;
        }
        int res=Integer.MAX_VALUE;
        if(Double.parseDouble(s)>res) return false;
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        long sum=0;
        int res=Integer.MAX_VALUE;
        while(sc.hasNextLine()){
            String[] s=sc.nextLine().trim().split("\\s+");
            for(int i=0;i<s.length;i++){
                if(check(s[i])==true ) sum+=Integer.parseInt(s[i]);
            }
        }
        System.out.println(sum);
        
    }
}
