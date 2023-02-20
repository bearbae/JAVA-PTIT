/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nop.tinhchuvitamgiac;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            chuvi a=new  chuvi(sc.nextDouble(),sc.nextDouble());
             chuvi b=new  chuvi(sc.nextDouble(),sc.nextDouble());
             chuvi c=new chuvi(sc.nextDouble(),sc.nextDouble());
            double ab=a.distance(b);
            double ac=a.distance(c);
            double bc=b.distance(c);
            if (ab+bc<=ac||ab+ac<=bc||ac+bc<=ab)System.out.print("INVALID");
            else System.out.printf("%.3f",ab+bc+ac);
            System.out.println();
        }
    }
}


