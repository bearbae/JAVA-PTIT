
package nop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HUY TRAN
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<sapXepThoiGian> a = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            sapXepThoiGian x = new sapXepThoiGian(gio, phut, giay);
            a.add(x);
        }
        Collections.sort(a, new Comparator<sapXepThoiGian>() {
            @Override
            public int compare (sapXepThoiGian o1, sapXepThoiGian o2){
                if(o1.getGio()!=o2.getGio()) return o1.getGio()-o2.getGio();
                else if (o1.getPhut()!=o2.getPhut()) return o1.getPhut()-o2.getPhut();
                else return o1.getGiay()-o2.getGiay();
            }
        });
        for(sapXepThoiGian x : a){
            System.out.println(x);
        }
    }
}
