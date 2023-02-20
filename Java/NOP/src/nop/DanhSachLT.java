package nop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DanhSachLT {
    private String ma,name,mp;
    private int time;

    public DanhSachLT(int ma, String name, String mp, int time) {
        this.ma = "KH"+String.format("%02d", ma);
        this.name = name;
        this.mp = mp;
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

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.name+" "+this.mp+" "+this.time;
    }

    
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("KHACH.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<DanhSachLT> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            String[] s3=sc.nextLine().split("/");
            String[] s4=sc.nextLine().split("/");
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
            cal1.set(Integer.parseInt(s3[2]), Integer.parseInt(s3[1])-1, Integer.parseInt(s3[0]));
            cal2.set(Integer.parseInt(s4[2]), Integer.parseInt(s4[1])-1, Integer.parseInt(s4[0]));
            int res=0;
            String s=sd.format(cal2.getTime());
            while(true){
                if(sd.format(cal1.getTime()).equals(s)) break;
                else{
                    cal1.add(cal1.DATE, 1);
                    res++;
                }
            }
            arr.add(new DanhSachLT(i, s1, s2, res));
        }
        Collections.sort(arr,new Comparator<DanhSachLT>(){
            @Override
            public int compare(DanhSachLT o1, DanhSachLT o2) {
                return o2.getTime()-o1.getTime();
            }
            
        });
        for(DanhSachLT x:arr){
            System.out.println(x);
        }
    }
}