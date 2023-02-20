/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nop;


import java.io.*;
import java.util.*;
import java.io.ObjectInputStream;
/**
 *
 * @author MrKhai
 */
public class lietketheothutuxuathien {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ob=new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a1=(ArrayList<String>) ob.readObject();
        Scanner sc=new Scanner(new File("VANBAN.in"));
        Set<String> set=new HashSet<>();
        for(String i:a1){
            String[] s=i.trim().toLowerCase().split("\\s+");
            for(int j=0;j<s.length;j++){
                set.add(s[j]);
            }
        }
        while(sc.hasNext()){
            String s=sc.next().toLowerCase();
            if(set.contains(s)){
                System.out.println(s);
                set.remove(s);
            }
        }
        
        
    }
}