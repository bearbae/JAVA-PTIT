thu.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author LOVE
 */
import java.util.Scanner;
public class thu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hcn h=new Hcn(sc.nextInt(),sc.nextInt(),sc.next());
        if (h.ktra())
        {
            h.cv();
            h.dt();
            h.mau();
        }
        else 
        {
            System.out.println("INVALID");
        }
    }
    
}

