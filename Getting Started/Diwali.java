// Curious Case of Diwali Bulbs.
/*
    1. You are given n number of bulbs. They are all switched off. A weird fluctuation in current hits the circuit n times.
       In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled,
       in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
    2. Take as input a number n, representing the number of bulbs.
    3. Print all the bulbs that will be on after the nth fluctuation in voltage.

    I/P-> 6 (n, an integer)
    O/P-> 1 (b1 b2 b3 b4 .. all bulbs that will be on after nth wave)
          4
*/

import java.util.Scanner;

public class Diwali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number of bulb : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }

        System.out.println();

        int i = 0;

        while (i < n) {
            for (int j = 0; j < n; j = j + 1 + i) {
                if (j + i < n) {
                    if (arr[j + i] == 0) {
                        arr[j + i] = 1;
                        //j = j + i;
                    } else {
                        arr[j + i] = 0;
                        //j = j + i;
                    }
                }
            }
            i++;
        }

        for (int k = 0; k < n; k++) {
            if (arr[k] == 1) {
                System.out.println(" Bulb " + (k + 1) + " is ON. : " + arr[k]);
            }
        }
    }
}
