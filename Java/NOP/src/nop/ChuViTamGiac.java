import java.util.Scanner;

public class ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);

            p1.is3PointAlign(p1, p2, p3);
            t-=1;
        }
        sc.close();
    }
}

class Vector extends Point {
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
class Point {
    //thuộc tính
    double x;
    double y;
    //method
    public Point() {}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        x = p.x;
        y = p.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Point secondPoint) {
        double distance = Math.sqrt((this.x - secondPoint.x)*(this.x - secondPoint.x) + (this.y - secondPoint.y)*(this.y - secondPoint.y));
        return distance;
    }

    public double distance(Point p1, Point p2) {
        double distance = Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
        return distance;
    }

    public void is3PointAlign(Point p1, Point p2, Point p3) {
        //vector chỉ phương từ 2 điểm p1 p2
        Vector vtcpP1P2 = new Vector(p2.x-p1.x, p2.y-p1.y);
        Vector vtcpP1P3 = new Vector(p3.x-p1.x, p3.y-p1.y);
        if ((vtcpP1P2.x / vtcpP1P2.y) == (vtcpP1P3.x / vtcpP1P3.y)) {
            System.out.println("INVALID");
        } else {
            //tính chu vi tam giác p1p2p3
            double chuVi = distance(p1, p2) + distance(p1, p3) + distance(p2, p3);
            if (chuVi == 0)
                System.out.println("INVALID");
            else
                System.out.printf("%.3f \n", chuVi);
        }
    }

    @Override
    public String toString() {
        return "(" + this.x + ";" + this.y + ")";
    }
}
