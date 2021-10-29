/*
    1. You are given as input marks of a student.
    2. Display an appropriate message based on the following rules:
  	  2.1 for marks above 90, print excellent.
  	  2.2 for marks above 80 and less than equal to 90, print good.
  	  2.3 for marks above 70 and less than equal to 80, print fair.
  	  2.4 for marks above 60 and less than equal to 70, print meets expectations.
  	  2.5 for marks less than equal to 60, print below par.
*/


import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter your marks : ");
        int marks = sc.nextInt();

        if (marks > 90 && marks <=100) {
            System.out.println(" RESULT : Excellent");
        } else if (marks > 80) {
            System.out.println(" RESULT : Good");
        } else if (marks > 70) {
            System.out.println(" RESULT : Fair");
        } else if (marks > 60) {
            System.out.println(" RESULT : Meets Expectations");
        } else if (marks >= 0){
            System.out.println(" RESULT : Below Par");
        } else {
            System.out.println(" ----------INVALID INPUT----------");
        }
    }
}
