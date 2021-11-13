// Check for Pythagorean Triplet.
/*
 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
 2. Take as input three numbers a, b and c.
 3. Print true if they can form a pythagorean triplet and false otherwise.
 I/P-> 5 3 4
 O/P-> true
 */

import java.util.Scanner;
import java.math.*;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter 1st number : ");
        long a = sc.nextInt();
        System.out.print(" Enter 2st number : ");
        long b = sc.nextInt();
        System.out.print(" Enter 3st number : ");
        long c = sc.nextInt();

        if ((a * a) == (b * b + c * c) || (b * b) == (a * a + c * c) || (c * c) == (b * b + a * a)) {
            System.out.println("\n True : " + a + " " + b + " " + c + " Its a Pythagorean triplet.");
        } else {
            System.out.println("\n False : " + a + " " + b + " " + c + " is not a Pythagorean triplet.");
        }
    }
}
