/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author MrKhai
 */
public class lietketukhacnhau {
    private String res;
    public lietketukhacnhau(String t) throws FileNotFoundException  {
        File f=new File(t);
        this.res="";
        Scanner sc=new Scanner(f);
        TreeSet<String> ts=new TreeSet<>();
        while(sc.hasNextLine()){
            String[] s=sc.nextLine().toLowerCase().split("\\s+");
            for(int i=0;i<s.length;i++) ts.add(s[i]);
        }
        for(String x:ts) {
            this.res+=x;
            this.res+="\n";
        }
    }

    @Override
    public String toString() {
        return this.res;
    }
    
    public static void main(String[] args) throws IOException {
        lietketukhacnhau ws = new lietketukhacnhau("VANBAN.in");
        System.out.println(ws);
    }
    public static void main4008536(String[] args) throws IOException {
        lietketukhacnhau ws = new lietketukhacnhau("VANBAN.in");
        System.out.println(ws);
    }
}

