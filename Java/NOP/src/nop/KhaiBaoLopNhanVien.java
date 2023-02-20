import java.util.Locale;
import java.util.Scanner;

public class KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String hoTen = sc.nextLine();
        String gioiTinh = sc.nextLine();
        String ngaySinh = sc.nextLine();
        String diaChi = sc.nextLine();
        String maSoThue = sc.nextLine();
        String ngayKiHopDong = sc.nextLine();

        NhanVien obj = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHopDong);
        obj.inThongTin();

        sc.close();
    }
}
class NhanVien {
    String maNV;
    String hoTen;
    String gioiTinh;
    String ngaySinh;
    String diaChi;
    String maSoThue;
    String ngayKiHopDong;

    public NhanVien(
        String hoTen,
        String gioiTinh,
        String ngaySinh,
        String diaChi,
        String maSoThue,
        String ngayKiHopDong
    ) {
        this.maNV = "00001";
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;

        //chuẩn hoá ngày
        if (ngaySinh.charAt(1) == '/')
            ngaySinh = "0" + ngaySinh.substring(0);
        if (ngaySinh.charAt(4) == '/')
            ngaySinh = ngaySinh.substring(0, 3) + "0" + ngaySinh.substring(3); 
        this.ngaySinh = ngaySinh;

        this.diaChi = diaChi;
        this.maSoThue = maSoThue;

        //chuẩn hoá ngày
        if (ngayKiHopDong.charAt(1) == '/')
            ngayKiHopDong = "0" + ngayKiHopDong.substring(0);
        if (ngayKiHopDong.charAt(4) == '/')
            ngayKiHopDong = ngayKiHopDong.substring(0, 3) + "0" + ngayKiHopDong.substring(3); 
        this.ngayKiHopDong = ngayKiHopDong;
    }

    public void inThongTin() {
        System.out.println(maNV+" "+hoTen+" "+gioiTinh+" "+ngaySinh+" "+diaChi+" "+maSoThue+" "+ngayKiHopDong);
    }
}
