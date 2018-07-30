public class Main  
{
    	public static void main(String args[]) {
		System.out.println("\nDivided by 2: ");		
		for (int i=1; i<100; i++) {
			if (i%2==0) 
			System.out.print(i +", ");
		}			
				
		System.out.println("\n\nDivided by 6: ");
		for (int i=1; i<100; i++) {
			if (i%6==0) System.out.print(i +", ");			
		}
				
		System.out.println("\n\nDivided by 2 & 6: ");			
		for (int i=1; i<100; i++) {
			if (i%3==0 && i%5==0) System.out.print(i +", ");			
		}
		System.out.println("\n");
  }
}
