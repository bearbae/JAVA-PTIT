import  java.util.TreeSet ; 
import java.util.Set ; 
import java.util.ArrayList ; 
        
import java.util.Scanner;


public class giaocuahaidayso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)  ; 
        int n = sc.nextInt() ; 
        int m = sc.nextInt() ; 
        Set<Integer> arr1 = new TreeSet<>() ; 
        Set<Integer> arr2 = new TreeSet<>() ; 
        for(int i = 0 ; i <  n  ; i++){
            arr1.add(sc.nextInt()) ;
        
                }
        for(int j = 0 ; j < m ; j++){
            arr2.add(sc.nextInt()) ; 
            }
        arr1.retainAll(arr2) ; 
        for(int i : arr1 ){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}