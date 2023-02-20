Hcn.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author LOVE
 */
public class Hcn {
    private double cr,cd;
    private String mau;
    public Hcn(double cr,double cd,String mau)
    {
        this.cr=cr;
        this.cd=cd;
        this.mau=mau;
    }
    public boolean ktra()
    {
        if (cr<=0||cd<=0)
        {
            return false;
        }
        else return true;
    }
    public void cv()
    {
        double k;
        k=(cr+cd)*2;
        System.out.printf("%.0f ",k);
    }
    public void dt()
    {
        double s;
        s=cr*cd;
        System.out.printf("%.0f ",s);
    }
    public void mau()
    {
        String tmp = "";
        tmp+=toUpperCase(mau.charAt(0));
        for(int i=1;i<mau.length();i++) 
            tmp+=Character.toLowerCase(mau.charAt(i));
        System.out.println(tmp);
    }
}