/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Admin
 */

    import java.math.BigInteger;
import java.util.Scanner;

public class tongsonguyenlon1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	while(t-->0)
	{
		String a=sc.next(),b=sc.next();
		BigInteger A=new BigInteger(a);
		BigInteger B=new BigInteger(b);
		String k=((A.add(B))).toString();
		System.out.println(k);
	}
}

}
