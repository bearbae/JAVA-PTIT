

phanso.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NOP;

import java.util.Scanner;

/**
 *
 * @author LOVE
 */
public class phanso {
    Scanner sc=new Scanner(System.in);
    private long tu;
    private long mau;
    
    public phanso(long tu,long mau)
    {
        this.tu=tu;
        this.mau=mau;
    }
    public long gcd(long a, long b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    @Override
    public String toString() {
        return tu/gcd(tu,mau)+"/"+mau/gcd(tu,mau);
    }   
}

