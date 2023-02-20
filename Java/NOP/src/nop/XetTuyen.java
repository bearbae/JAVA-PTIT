package nop;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Math.round;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MrKhai
 */
public class XetTuyen {
    private String ma,name,loai;
    private double d1,d2,dtb;
    private int tuoi;

    public XetTuyen(int ma, String name, double d1, double d2, double dtb, int tuoi) {
        this.ma = "PH"+String.format("%02d", ma);
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        if(dtb>10) this.dtb=10;
        else this.dtb = round(dtb);
        this.tuoi = tuoi;
        if(this.dtb>=9 ) this.loai="Xuat sac";
        else if(this.dtb>=8) this.loai="Gioi";
        else if(this.dtb>=7) this.loai="Kha";
        else if(this.dtb>=5) this.loai="Trung binh";
        else this.loai="Truot";
    }
    
    public void setName(String name) {
        String[] s = name.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < s.length; i++) {
            res += Character.toUpperCase(s[i].charAt(0));
            for (int j = 1; j < s[i].length(); j++) {
                res += Character.toLowerCase(s[i].charAt(j));
            }
            if (i != s.length - 1) {
                res += " ";
            }
        }
        this.name = res;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.name+" "+this.tuoi+" "+(int)this.dtb+" "+this.loai;
    }
    
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc=new Scanner(new File("XETTUYEN.in"));
        
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<XetTuyen> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String name=sc.nextLine();
            String s=sc.nextLine().split("/")[2];
            int tuoi=2021-Integer.parseInt(s);
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            double ans=0;
            if(d1>=8 && d2>=8) ans=1;
            else if(d1>=7.5 && d2>=7.5) ans=0.5;
            double dt=(d1+d2)/2+ans;
            XetTuyen x=new XetTuyen(i, name,d1,d2,dt,tuoi);
            x.setName(name);
            arr.add(x);
        }
        for(XetTuyen x:arr){
            System.out.println(x);
        }
    }
         
}