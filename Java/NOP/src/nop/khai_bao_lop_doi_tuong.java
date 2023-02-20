import java.util.Scanner ; 
public class khai_bao_lop_doi_tuong {
    private double x1,y1,x2,y2;
    
    public khai_bao_lop_doi_tuong(double x1,double y1,double x2,double y2)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public double distance()
    {
        double k;
        k=Math.sqrt(Math.pow(Math.abs(x1-x2),2)+Math.pow(Math.abs(y1-y2),2));
        return k;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            double k;
            khai_bao_lop_doi_tuong po= new khai_bao_lop_doi_tuong(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            k=po.distance();
            System.out.printf("%.4f\n",k);
        }
    }
}
