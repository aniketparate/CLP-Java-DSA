/*
    1. You've to print first n fibonacci numbers.
    2. Take as input "n", the count of fibonacci numbers to print.
    3. Print first n fibonacci numbers.
*/
import java.util.*;
  
public class Fibonacci{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = 0, b = 1, sum, count = 2;

      System.out.print(" Enter the number : ");
      int n = sc.nextInt();

      System.out.println(a);
      System.out.println(b);
      while (count < n) {
          sum = a + b;
          System.out.println(" " + sum);
          a = b;
          b = sum;
          count++;
      }
   }
}
