// Find GCD and LCM of the numbers.
/*
    1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
    2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
    3. Take input "num1" and "num2" as the two numbers.
    4. Print their GCD and LCM.
    I/P-> 36
          24
    O/P-> 12
          72
*/

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print(" Enter 2nd rotations : ");
        int num2 = sc.nextInt();
        int count = 0;

        for (int i = 1; i < num1 && i < num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                count = i;
            }
        }
        System.out.println("\n GCD of " + num1 + " and " + num2 + " is : " + count);

        mainloop:
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                if (num1 * i == num2 * j) {
                    count = num1 * i;
                    break mainloop;
                }
            }
        }
        System.out.println(" LCM of " + num1 + " and " + num2 + " is : " + count);
    }
}
