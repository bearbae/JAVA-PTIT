import java.util.Scanner;

public class TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ma = sc.next();
        sc.nextLine();
        String hoten = sc.nextLine();
        long luongCoBan = sc.nextLong();

        String chucVu = ma.substring(0,2).toUpperCase();
        String bacLuong = ma.substring(2, 4);
        long heSoLuong = Long.parseLong(bacLuong);

        long phuCap=0;
        if (chucVu.equals("HT")) 
            {phuCap = 2000000;}
        if (chucVu.equals("HP")) 
            {phuCap = 900000;}
        if (chucVu.equals("GV"))
            {phuCap = 500000;}

        long luongTong = luongCoBan*heSoLuong + phuCap;

        System.out.println(ma + " " + hoten + " " + heSoLuong + " "+phuCap+ " "+luongTong);

        sc.close();
    }
}
