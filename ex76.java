public class Main  
{
 public static void main(String[] args)
 {
    int[] num_array1 = {5, -2, 0, 3, 4, 6, 12};
	int[] num_array2 = {45, 2, 1, 2, 3, 5, 11};
    
	System.out.println(num_array1[0] == num_array2[0] || num_array1[num_array1.length-1] == num_array2[num_array2.length-1]);
 }
}
