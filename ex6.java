import java.util.*;
import java.lang.*;

class ex6
{  
  
    

    public static void main(String[] args) {
        
        int num1, num2, sum,diff,product,quo,mod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum= num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
        diff = num1 - num2;
        System.out.println("Difference of these numbers: "+diff);
        product = num1 * num2;
        System.out.println("Product of these numbers: "+product);
        quo = num1 / num2;
        System.out.println("quotient of these numbers: "+quo);
        mod = num1 % num2;
        System.out.println("Remainder of these numbers: "+mod);
        
        
        
    }
}
