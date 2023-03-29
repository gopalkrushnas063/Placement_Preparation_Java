import java.util.*;
import java.io.*;


public class Solution {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(Integer i : arr){
          map.put(i,map.getOrDefault(i,0)+1);
        }
        
        
        
        
        for(Integer key : map.keySet()){
            
            System.out.println(key+"->"+map.get(key));
            
        }



        Set<Integer> set = new HashSet<>();

        for(Integer i: arr){
        	set.add(i);
        }

        System.out.println(set);

        
			
	}
	

}

+------------------------------------------------------------------------------------------+
| Basic	                     HashSet 	                            HashMap              |
+------------------------------------------------------------------------------------------+
| Implements 	           Set interface 	                      Map interface        |
+------------------------------------------------------------------------------------------+
| Duplicates	               No 	                     Yes dupl val no dupl key    |
+------------------------------------------------------------------------------------------+
| Dummy values 	              Yes 	                             No                  |
+------------------------------------------------------------------------------------------+
| Objects required         	   1	                                   2                   |
+------------------------------------------------------------------------------------------+
| Add and store mechanism 	HashMap 	                        Hashing technique        |
+------------------------------------------------------------------------------------------+
| Speed	                  slower than HashMap	             faster than HashSe      |
+------------------------------------------------------------------------------------------+
| Insertion Method	           Add()	                               Put()             |
+------------------------------------------------------------------------------------------+