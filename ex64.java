import java.util.*;
 public class Main  
 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		System.out.println("Result: "+common_digit(a, b));
    }
	
	public static boolean common_digit(int p, int q)
     {  
	   if (p<40 || q>80)
		   return false;
	   int x = p % 20;
	   int y = q % 20;
	   p /= 20;
	   q /= 20;
	   return (p == q || p == y || x == q || x == y);
     }
}
