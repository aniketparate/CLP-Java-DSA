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
        long temp = num;

        System.out.print("\n No of digits : ");
        while (temp != 0) {
            temp = temp / 10;
            ++count;
        }
        System.out.println(num);
        System.out.print(count);
   }
}
