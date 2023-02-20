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
public class danhsachmonhoc {
    private String ma,name;
    private int stc;

    public danhsachmonhoc (String ma, String name, int stc) {
        this.ma = ma;
        this.name = name;
        this.stc = stc;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return this.ma+" "+this.name+" "+this.stc;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<danhsachmonhoc > arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            danhsachmonhoc  x=new danhsachmonhoc (ma, name, sl);
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<danhsachmonhoc >(){
            @Override
            public int compare(danhsachmonhoc  o1, danhsachmonhoc o2) {
                return o1.getName().compareTo(o2.getName());
            }          
        });
        for(danhsachmonhoc  x:arr){
            System.out.println(x);
        }
    }
}