import java.util.*; 
public class Main  
{
 public static void main(String[] args)
 {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: fizz buzz",i);
            } else if (i % 5 == 0) {
                System.out.printf("\n%d: buzz",i);
            } else if (i % 3 == 0) {
                System.out.printf("\n%d: fizz",i);
            } 
        }
        System.out.printf("\n");
    }
}
© 2018 GitHub, Inc.
