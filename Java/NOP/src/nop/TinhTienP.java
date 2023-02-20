package nop;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MrKhai
 */
public class TinhTienP {

    private String ma, name;
    private String sp;
    private long time,tt;

    public TinhTienP(int ma, String name, String sp, long time, long tt) {
        this.ma = "KH"+String.format("%02d", ma);
        this.name = name;
        this.sp = sp;
        this.time = time;
        if(sp.charAt(0)=='1') this.tt=time*25+tt;
        else if(sp.charAt(0)=='2') this.tt=time*34+tt;
        else if(sp.charAt(0)=='3') this.tt=time*50+tt;
        else this.tt=time*80+tt;
    }

    public long getTt() {
        return tt;
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
        return this.ma + " " + this.name + " " + this.sp + " " + this.time + " " + this.tt;
    }

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<TinhTienP> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine().trim();
            String s3 = sc.nextLine();
            String s4 = sc.nextLine();
            SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
            Date d1 = sd.parse(s3);
            Date d2 = sd.parse(s4);
            long res=d2.getTime()-d1.getTime();
            res/=(60*60*24*1000);
            res++;
            long pp=Long.parseLong(sc.nextLine());
            TinhTienP x=new TinhTienP(i, s1, s2,  res, pp);
            x.setName(s1);
            arr.add(x);
        }
        Collections.sort(arr,new Comparator<TinhTienP>(){
            @Override
            public int compare(TinhTienP o1, TinhTienP o2) {
                return (int)o2.getTt()-(int)o1.getTt();
            }
        });
        for(TinhTienP x:arr){
            System.out.println(x);
        }
    }
}
