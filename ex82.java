import java.util.Arrays; 
 public class Main  
 {
 public static void main(String[] args)
 {
    int[] array_nums = {120, 30, 240, 750, 967};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int max_val = array_nums[0];
	if(max_val <= array_nums[array_nums.length-1])
		max_val = array_nums[array_nums.length-1];
	if(max_val <= array_nums[array_nums.length/2])
		max_val = array_nums[array_nums.length/2];
	System.out.println("Largest element between first, last, and middle values: "+max_val);  
 }
}
