import java.lang.*;
 public class Main {
 public static void main(String[] args)
 {
   String main_string = "Python 5.0";
      
   String last_three_chars = main_string.substring(main_string.length() - 5);
   System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);
  }
    }
