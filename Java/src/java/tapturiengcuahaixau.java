
import java.util.*;


public class tapturiengcuahaixau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine()  ;
        while(t-->0)
        {
            String s1 = sc.nextLine() ; 
            String s2 = sc.nextLine() ; 
           
            TreeSet<String> arr1 = new TreeSet<>(Arrays.asList(s1.split(" "))) ; 
            TreeSet<String> arr2 = new TreeSet<>(Arrays.asList(s2.split(" "))) ; 
//           for(String i : arr1)
//           {
//               for(String j : arr2)
//               {
//                  if(i == j ){
//                      arr1.remove(i) ;
//                       break  ; 
//                   } 
//                }
//            }
//           for(String i : arr1 )
//           {
//              System.out.println(i);
//         }
//          
	for(String x:arr1)
		{
			if(arr2.contains(x)==false) System.out.print(x+" ");
		}
            System.out.println();
        }
    }
}
