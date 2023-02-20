/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author Admin
 */

    import java.util.Scanner;

public class chiahetcho11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	while(t-->0)
	{
		String s=sc.nextLine();
		int c=0,l=0;
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				l+=(s.charAt(i)-'0');
			}
			else c+=(s.charAt(i)-'0');
		}
		int x=Math.abs(c-l);
		if(x%11==0) System.out.println("1");
		else System.out.println("0");
	}
}
}
