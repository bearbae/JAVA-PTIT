package nop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author MrKhai
 */
public class DanhSachTrungTuyen {
    private String ma,name;
    private double dv,td;

    public DanhSachTrungTuyen(String ma, String name, double td) {
        this.ma = ma;
        this.name = name;
        if(ma.charAt(2)=='1') this.dv=0.5;
        else if(ma.charAt(2)=='2') this.dv=1;
        else this.dv=2.5;
        this.td=this.dv+td;
    }

    public double getTd() {
        return td;
    }

    public String getMa() {
        return ma;
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
        if(this.td==(int)this.td && this.dv==(int)this.dv) return this.ma+" "+this.name+" "+(int)this.dv+" "+(int)this.td+" ";
        if(this.td==(int)this.td && this.dv!=(int)this.dv) return this.ma+" "+this.name+" "+this.dv+" "+(int)this.td+" ";
        return this.ma+" "+this.name+" "+this.dv+" "+String.format("%.1f", this.td)+" ";
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("THISINH.in"));
        ArrayList<DanhSachTrungTuyen> arr=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            double d3=Double.parseDouble(sc.nextLine());
            DanhSachTrungTuyen x=new DanhSachTrungTuyen(ma, name, d1*2+d2+d3);
            x.setName(name);
            arr.add(x);
        }
        int ans=Integer.parseInt(sc.nextLine());
        Collections.sort(arr,new Comparator<DanhSachTrungTuyen>(){
            @Override
            public int compare(DanhSachTrungTuyen o1, DanhSachTrungTuyen o2) {
                if(o1.getTd()==o2.getTd()) return o1.getMa().compareTo(o2.getMa());
                else if(o2.getTd()>o1.getTd()) return 1;
                else return -1;
            }
        });
        
        double res=arr.get(0).getTd();
        for(int i=0;i<ans;i++){
            res=arr.get(i).getTd();
        }
        System.out.println(String.format("%.1f", res));
        for(DanhSachTrungTuyen x:arr){
            if(x.getTd()>=res) System.out.println(x+"TRUNG TUYEN");
            else System.out.println(x+"TRUOT");
        }
    }
}

