

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LOVE
 */
public class chuanhoaxauhoten2 {
    public static String xl(String s)
	{
		String res="";
		char tmp=s.charAt(0);
		if(Character.isLowerCase(tmp))
		{
			tmp-=32;
			res+=tmp;
		}
		else res+=tmp;
		for(int i=1;i<s.length();i++)
		{
			tmp=s.charAt(i);
			if(Character.isUpperCase(tmp))
			{
				tmp+=32;
			}
			res+=tmp;
	}	
		return res;
	}
    public static String x2(String s)
    {
        String res="";
        for (int i=0;i<s.length();i++)
        {
            char tmp=s.charAt(i);
            if (Character.isLowerCase(tmp))
            {
                tmp-=32;
            }
            res+=tmp;
        }
        return res;
    }
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	while(t-->0)
	{
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s);
                ArrayList<String> a=new ArrayList<>();
		while(st.hasMoreTokens())
		{
			a.add(st.nextToken());
		}
		for(int i=1;i<a.size();i++)
		{
			if(i!=a.size()-1) System.out.print(xl(a.get(i))+" ");
			else System.out.print(xl(a.get(i))+", ");
		}
		System.out.println(x2(a.get(0)));
	}
}
}
