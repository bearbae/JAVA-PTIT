/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nop;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * @author MrKhai
 */
public class sothuanghichtrongdfile {
    public static boolean check(int n){
        if(n<10) return false;
        int cnt=0,m=n,res=0;
        while(n!=0){
            int x=n%10;
            res=res*10+x;
            if(x%2==0) return false;
            cnt++;
            n/=10;
        }
        if(res!=m) return false;
        if(cnt%2==0) return false;
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream a1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream a2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1=(ArrayList<Integer>) a1.readObject();
        ArrayList<Integer> arr2=(ArrayList<Integer>) a2.readObject();
        int[] a=new int[1000001];
        int[] b=new int[1000001];
        for(int x: arr1){
            if(check(x)==true){
                a[x]=1;
                b[x]++;
            }
        }
        for(int x: arr2){
            if(check(x)==true){
                if(a[x]==1) a[x]=2;
                b[x]++;
            }
        }
        int ans=0;
        for(int i=0;i<=1000000;i++){
            if(a[i]==2){
                System.out.println(i+" "+b[i]);
                ans++;
            }
            if(ans==10) break;
        }
    }
}