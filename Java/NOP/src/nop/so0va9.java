
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class so0va9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String res="9";
            Queue<String> q=new LinkedList<>();
            q.add(res);
            while(true){
                q.add(q.peek()+"0");
                q.add(q.peek()+"9");
                long ans=Long.parseLong(q.peek());
                q.remove();
                if(ans%n==0){
                    System.out.println(ans);
                    break;
                }
            }
            
        }
    }
}
