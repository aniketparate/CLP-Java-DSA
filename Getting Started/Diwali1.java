import java.util.Scanner;

public class Diwali1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number of bulb : ");
        int n = sc.nextInt();

        for (int i = 1; i * i < n; i++) {
            System.out.println(i * i);
        }
    }
}
