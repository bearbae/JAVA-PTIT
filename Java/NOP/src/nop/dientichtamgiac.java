DienTichTamGiac.java
package Bai_1;

import java.util.Scanner;

public class DienTichTamGiac {
	private double x,y;
	public DienTichTamGiac() {
		// TODO Auto-generated constructor stub
	}
	public DienTichTamGiac(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double distance(DienTichTamGiac p1)
	{
		return Math.sqrt(Math.pow(this.x-p1.x, 2)+Math.pow(this.y-p1.y, 2));
	}
}

main.java
package Bai_1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			DienTichTamGiac a=new DienTichTamGiac(sc.nextDouble(), sc.nextDouble());
			DienTichTamGiac b=new DienTichTamGiac(sc.nextDouble(), sc.nextDouble());
			DienTichTamGiac c=new DienTichTamGiac(sc.nextDouble(), sc.nextDouble());
			double ab=a.distance(b),ac=a.distance(c),bc=b.distance(c);
			if(ab+ac<=bc || ab+bc<=ac || bc+ac<=ab) System.out.println("INVALID");
			else
			{
				System.out.printf("%.2f\n",Math.sqrt((ab+ac+bc)*(ab-ac+bc)*(ab+ac-bc)*(ac+bc-ab))/4);
			}
		}
	}
}

