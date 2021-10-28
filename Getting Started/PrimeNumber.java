/*
    1. You've to check whether a given number is prime or not.
    2. Take a number "t" as input representing count of input numbers to be tested.
    3. Take a number "n" as input "t" number of times.
    4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
*/
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter no of times you want to test : ");
        int t = sc.nextInt();

        int[] n = new int[t];

        for (int i = 0; i < t; i++) {
            int count = 0;
            System.out.print(" Enter number : ");
            n[i] = sc.nextInt();

            if (n[i] == 0 || n[i] == 1) {
                System.out.println(" 0 is neither Prime nor Composite");
                continue;
            }

            for (int j = 2; j < n[i]; j++) {
                if (n[i] % j == 0)
                    ++count;
            }

            if (count > 0) {
                System.out.println(" " + n[i] + " is not a Prime number");
            } else {
                System.out.println(" " + n[i] + " is a Prime number");
            }
            System.out.println();
        }
     }
}
