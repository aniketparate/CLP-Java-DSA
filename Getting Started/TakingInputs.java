/*
    Take a integer, decimal, string & character as inputs and print them out. 
*/

import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter a number : ");
        int number = sc.nextInt();

        System.out.print(" Enter a decimal number : ");
        float decimal = sc.nextFloat();

        System.out.print(" Enter a string : ");
        String s = sc.next();

        System.out.print(" Enter a character : ");
        String c = sc.next();

        System.out.println("\n " + number);
        System.out.println(" " + decimal);
        System.out.println(" " + s);
        System.out.println(" " + c);
    }
}
