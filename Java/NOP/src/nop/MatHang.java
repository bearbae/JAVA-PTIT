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
public class MatHang {
    private String ma,name,loai;
    private double mua,ban,ln;

    public MatHang(int ma,String name, String loai, double mua, double ban) {
        this.ma="MH"+String.format("%02d", ma);
        this.name = name;
        this.loai = loai;
        this.mua = mua;
        this.ban = ban;
        this.ln=this.ban-this.mua;
    }

    public String getMa() {
        return ma;
    }

    public double getLn() {
        return ln;
    }
    
    @Override
    public String toString() {
        return this.ma+" "+this.name+" "+this.loai+" "+String.format("%.2f", this.ln);
    }
    
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MATHANG.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            double s3=Double.parseDouble(sc.nextLine());
            double s4=Double.parseDouble(sc.nextLine());
            arr.add(new MatHang(i+1, s1, s2, s3, s4));
        }
        Collections.sort(arr,new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.getLn()==o2.getLn()) return o1.getMa().compareTo(o2.getMa());
                else if(o2.getLn()>o1.getLn()) return 1;
                else return -1;
            }
        });
        for(MatHang x:arr){
            System.out.println(x);
        }
    }
}