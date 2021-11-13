// Rotate a number by n position.
/*
 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right
    i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k.
    Also k can have an absolute value larger than number of digits in n.
 2. Take as input n and k.
 3. Print the rotated number.
 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
 n = 12340056
 k = 3
 r = 05612340
 I/P-> 562984
 k = 2
 O/P-> 845629
 */

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter a number : ");
        int n = sc.nextInt();
        System.out.print(" Enter no of rotation : ");
        int r = sc.nextInt();

        int count = 0;
        int temp = n;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        r = r % count;
        if (r < 0) {
            r = r + count;
        }

        int div = 1;
        int mul = 1;

        for (int i = 0; i < count; i++) {
            if (i < r) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }

        int quo = n % div;
        int rem = n / div;

        int sol = quo * mul + rem;

        System.out.println("\n After rotation : " + sol);
    }
}
