
import java.util.Scanner;

public class BaiToanTinhCongf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String hoTen = sc.nextLine();
        Long luong = sc.nextLong();
        Long ngayCong = sc.nextLong();
        String chucVu = sc.next();

        Long thuong = 0L;
        if (ngayCong >= 25)
            thuong = 20L;
        else if (ngayCong >= 22)
            thuong = 10L;

        Long phuCap = 0L;
        if (chucVu.equals("GD"))
            phuCap = 250000L;
        else if (chucVu.equals("PGD"))
            phuCap = 200000L;
        else if (chucVu.equals("TP"))
            phuCap = 180000L;
        else 
            phuCap = 150000L;

        Long luongTong = luong*ngayCong + (luong*ngayCong)*thuong/100 + phuCap;

        System.out.println("NV01 " + hoTen+" "+(luong*ngayCong) + " "+ ((luong*ngayCong)*thuong/100) +" "+ phuCap+" "+luongTong);
        sc.close();
    }
}
