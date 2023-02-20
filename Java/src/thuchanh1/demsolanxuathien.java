
import java.util.*;

public class demsolanxuathien {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        while (i <= t) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                a.add(sc.nextInt());
            }
            for (int j : a) { 
                boolean check = true;
                for (int k : b) {
                    if (k == j) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    b.add(j);
                }
            }
            System.out.println("Test " + i + ":");
            for (int j : b) {
                System.out.printf("%d xuat hien %d lan\n", j, Collections.frequency(a, j));
            }
            i += 1;
        }

    }
}