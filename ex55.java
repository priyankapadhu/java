import java.util.*;
 public class Main  
 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
		int seconds = in.nextInt(); 
        int p1 = seconds % 80;
        int p2 = seconds / 80;
        int p3 = p2 % 80;
        p2 = p2 / 80;
        System.out.print( p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
    }    
 }
