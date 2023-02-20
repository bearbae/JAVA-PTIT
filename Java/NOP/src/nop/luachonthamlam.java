/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class luachonthamlam {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),s=sc.nextInt();
	if(s==0 || 9*n<s) System.out.println("-1 -1");
	else
	{
		int x=s;
		int[] a=new int[n],b=new int[n];
		for(int i=0;i<n;i++)
		{
			if(s>9)
			{
				a[i]=9;
				s-=9;
			}
			else
			{
				if(i==n-1) a[i]=s;
				else
				{
					if(s>1)
					{
						a[i]=s-1;
						s=1;
					}
					else
					{
						a[i]=0;
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(x>9)
			{
				b[i]=9;
				x-=9;
			}
			else
			{
				b[i]=x;
				x-=x;
			}
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.print(" ");
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]);
		}
	}
}
}

