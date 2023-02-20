import java.util.Scanner;

public class phanso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuSo = sc.nextLong();
        long mauSo = sc.nextLong();
        Fraction obj = new Fraction(tuSo, mauSo);
        obj.rutGon();
        sc.close();
    }
}

class Fraction {
    private long tuSo;
    private long mauSo;

    public Fraction(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    private long gcd() {
        long t1 = tuSo, t2 = mauSo;
        while (t2 != 0) {
            long t = t1;
            t1 = t2;
            t2 = t % t2; 
        }
        return t1;
    }

    public void rutGon() {
        System.out.println(tuSo/gcd() + "/" + mauSo/gcd());
    }
}
