import java.util.*;
 public class Main  
 {
     public static void main(String[] args){
		int x = 15;
		int y = 25;
		int p = 30;
		System.out.println(result(x,y,p));
	 } 		
	public static int result(int x, int y, int p) {	
		if (x%p == 0)
			return( y/p - x/p + 1);
		return(y/p - x/p);
	}
 }
