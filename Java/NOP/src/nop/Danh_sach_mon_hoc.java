/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nop;

package javaapplication1;

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
public class Danh_sach_mon_hoc {
    private String ma,name;
    private int stc;

    public Danh_sach_mon_hoc(String ma, String name, int stc) {
        this.ma = ma;
        this.name = name;
        this.stc = stc;
    }

    public String getName() {
        return name;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getStc() {
        return stc;
    }

    public void setStc(int stc) {
        this.stc = stc;
    }
    
    @Override
    public String toString() {
        return this.ma+" "+this.name+" "+this.stc;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DN.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Danh_sach_mon_hoc> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            Danh_sach_mon_hoc x=new Danh_sach_mon_hoc(ma, name, sl);
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<Danh_sach_mon_hoc>(){
            @Override
            public int compare(Danh_sach_mon_hoc o1, Danh_sach_mon_hoc o2) {
                return o1.getMa().compareTo(o2.getMa());
            }          
        });
        for(Danh_sach_mon_hoc x:arr){
            System.out.println(x);
        }
    }
}
