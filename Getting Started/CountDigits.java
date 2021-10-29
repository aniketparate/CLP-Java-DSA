/*
    1. You've to count the number of digits in a number.
    2. Take as input "n", the number for which the digits has to be counted.
    3. Print the digits in that number.
 */
import java.util.*;
  
public class CountDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("\n Enter the number : ");
        long num = sc.nextInt();

        System.out.print("\n No of digits : ");
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        System.out.print(count);
   }
}
