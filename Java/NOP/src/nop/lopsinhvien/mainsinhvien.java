

package nop;

import java.util.Scanner;

public class mainsinhvien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        khiabaolopsinhvien x=new khiabaolopsinhvien();
        String res=sc.nextLine();
	x.setHt(res);
	res=sc.nextLine();
	x.setLop(res);
	res=sc.nextLine();
	String[] a=res.split("/");
	String tmp="";
	for(int i=0;i<3;i++)
	{
		if(a[i].length()==1)
		{
			tmp+="0";
			tmp+=a[i];
		}
		else tmp+=a[i];
		if(i!=2) tmp+="/";
	}
	x.setNs(tmp);
	float d=sc.nextFloat();
	x.setGpa(d);
	System.out.println(x);
    }
}
