import java.util.Scanner;

public class GcdLcm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print(" Enter 2nd number : ");
        int num2 = sc.nextInt();

        int dividend = num1;
        int divisor = num2;
        int rem;

        while (dividend % divisor != 0) {
            rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }

        int GCD = divisor;
        System.out.println("\n GCD : " + GCD);

        int LCM = (num1 * num2) / GCD;
        System.out.println(" LCM : " + LCM);
    }
}
