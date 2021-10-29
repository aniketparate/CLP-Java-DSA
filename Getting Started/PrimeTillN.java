/* 
    1. You've to print all prime numbers between a range. 
    2. Take as input "low", the lower limit of range.
    3. Take as input "high", the higher limit of range.
    4. For the range print all the primes numbers between low and high (both included).
*/
import java.util.*;

public class PrimeTillN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter lower limit : ");
        int low = sc.nextInt();

        System.out.print(" Enter higher limit : ");
        int high = sc.nextInt();
        System.out.println();

        for (; low <= high; low++) {
            int count = 0;
            for (int i = 2; i*i <= low; i++) {
                if (low % i == 0)
                    ++count;
            }
            if (count == 0) {
                System.out.println(" " + low + " is a Prime number");
            }
        }
    }
}