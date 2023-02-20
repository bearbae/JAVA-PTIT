package nop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author MrKhai
 */
public class capsonguyentotrongfile1 {
    public static int[] a=new int[1000001];
    public static void snt(){
        Arrays.fill(a, 1);
        a[0]=a[1]=0;
        for(int i=2;i<=1000;i++){
            if(a[i]==1){
                for(int j=i*i;j<=1000000;j+=i){
                    a[j]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        snt();
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1=(ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> arr2=(ArrayList<Integer>) ois2.readObject();
        Collections.sort(arr1);
        int[] b=new int[1000001];
        int[] c=new int[1000001];
        for(Integer i:arr1){
            c[i]+=a[i];
        }
        for(Integer i:arr2){
            b[i]+=a[i];
        }
        for(int i=2;i<=1000000;i++){
            int j=1000000-i;
            if(i<j && c[i]!=0 && b[j]!=0){
                System.out.println(i+" "+j);
            }
        }
    }
}
