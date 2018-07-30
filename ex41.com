public class Main  
{

	public static void main(String[] String) {
		int chr = 'j';
		System.out.println("The ASCII value of j is :"+chr);
	}
}
