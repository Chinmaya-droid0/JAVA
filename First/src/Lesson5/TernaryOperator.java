package Lesson5;

import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Marks: ");
        int marks = sc.nextInt();


        String result = (marks > 70) ? "Pass" : "Fail";

        System.out.println(result);
    }
}
