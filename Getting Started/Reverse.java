/*
    1. You've to display the digits of a number in reverse.
    2. Take as input "n", the number for which digits have to be display in reverse.
    3. Print the digits of the number line-wise, but in reverse order.
 */
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long temp;
        System.out.print("\n Enter the number : ");
        long num = sc.nextInt();

        System.out.print("\n The reversed digit is : ");
        while (num != 0) {
            temp = num % 10;
            System.out.print(temp);
            num = num / 10;
        }
    }
}
