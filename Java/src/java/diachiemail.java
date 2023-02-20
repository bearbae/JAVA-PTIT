//
//import java.util.Scanner;
//
//
//public class diachiemail {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in) ; 
//        int t = sc.nextInt() ; 
//        sc.nextLine() ; 
//        while(t-->0)
//        {
//            String s = sc.nextLine().toLowerCase().trim().replaceAll("//s+", " ") ; 
//            String[] tmp = s.split(" ") ; 
//            s= "" ; 
//             s += tmp[tmp.length-1] ; 
//            for(int i = 0 ; i < tmp.length -1; i++)
//            {
//                s +=  tmp[i].charAt(0) ; 
//            }
//            System.out.println(s + "@ptit.edu.vn");
//        }
//        
//    }
//}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LOVE
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
public class diachiemail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> mp =new HashMap<>();
        while (t-->0)
        {
            String s=sc.nextLine();
            StringTokenizer st=new StringTokenizer(s);
            ArrayList<String> a = new ArrayList<String>();
            while(st.hasMoreTokens())
            {
                a.add(st.nextToken());
            }
            String res="";
            res+=a.get(a.size()-1).toLowerCase();
            for (int i=0;i<a.size()-1;i++)
            {
                res+=Character.toLowerCase(a.get(i).charAt(0));
            }
            if (mp.containsKey(res))
            {
                int x=mp.get(res);
                x++;
                mp.put(res,x);
            }
            else mp.put(res,1);
            if (mp.get(res)==1) System.out.println(res+"@ptit.edu.vn");
            else System.out.println(res+mp.get(res)+"@ptit.edu.vn");
        }
    }
}
