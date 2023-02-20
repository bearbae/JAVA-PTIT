package nop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author MrKhai
 */
public class loaiphong implements Comparable<loaiphong>{

    private String name,gt;

    public loaiphong(String k) {
        this.gt=k.split(" ")[1];
        this.name=k;
    }
    @Override
    public int compareTo(loaiphong x) {
        return this.gt.compareTo(x.gt);
    }
    @Override
    public String toString() {
        return this.name;
    }
    
    public static void main(String args[]) throws FileNotFoundException {
        ArrayList<loaiphong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new loaiphong(in.nextLine()));
        }
        Collections.sort(ds);
        for(loaiphong tmp : ds){
            System.out.println(tmp);
        }
    }
}

