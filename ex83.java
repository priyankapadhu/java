import java.util.*;
 public class Main  
 {
     public static void main(String[] args){	
	   String result = "";
	   int[] left_array = {11, 53, -5, 24};
	   int[] right_array = {10, 64, -15,-92};
	   System.out.println("\nArray1: "+Arrays.toString(left_array));  
	   System.out.println("\nArray2: "+Arrays.toString(right_array)); 
       for (int i = 0; i < left_array.length; i++) {
				int num1 = left_array[i];
				int num2 = right_array[i];
				result += Integer.toString(num1 * num2) + " "; 
			}
		System.out.println("\nResult: "+result);     
	 }			
}
