import java.util.Scanner;

public class khaibaolopthisinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine();
        double mon1 = sc.nextDouble();
        double mon2 = sc.nextDouble();
        double mon3 = sc.nextDouble();

        ThiSinh obj = new ThiSinh(hoTen, ngaySinh, mon1, mon2, mon3);
        obj.inThongTin();

        sc.close();
    }
}

class ThiSinh {
    String hoTen;
    String ngaySinh;
    double mon1;
    double mon2;
    double mon3;
    double tongDiem;

    public ThiSinh(String hoTen, String ngaySinh, double mon1, double mon2, double mon3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        this.tongDiem = (mon1 + mon2 + mon3);
    }

    public void inThongTin() {
        System.out.print(hoTen + " " + ngaySinh + " ");
        System.out.printf("%.1f", tongDiem);
    }
}