/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class docfilevanban {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
