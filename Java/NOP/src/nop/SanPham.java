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
public class SanPham {
    private String ma,name;
    private int gia,time;

    public SanPham(String ma, String name, int gia, int time) {
        this.ma = ma;
        this.name = name;
        this.gia = gia;
        this.time = time;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.name+" "+this.gia+" "+this.time;
    }
    
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SANPHAM.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            int s3=Integer.parseInt(sc.nextLine());
            int s4=Integer.parseInt(sc.nextLine());
            arr.add(new SanPham(s1, s2, s3, s4));
        }
        Collections.sort(arr,new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                if(o1.getGia()==o2.getGia()) return o1.getMa().compareTo(o2.getMa());
                return o2.getGia()-o1.getGia();
            }
        });
        for(SanPham x:arr){
            System.out.println(x);
        }
    }
}
