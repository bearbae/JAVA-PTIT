
package nop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
            thunhapgiaovien a=new thunhapgiaovien();
            a.setCv(sc.nextLine());
            a.setTen(sc.nextLine());
            a.setLcb(sc.nextLong());
            a.setHsl();
            a.setPhucap();
            a.setTongluong();
            System.out.println(a);
       
    }
}
