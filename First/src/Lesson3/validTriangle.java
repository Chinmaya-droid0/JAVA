package Lesson3;

import java.util.Scanner;

public class validTriangle {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

        System.out.println("Enter the angles: ");
           int a = input.nextInt();
           int b = input.nextInt();
           int c = input.nextInt();

           int sum = a+b+c;

           if(sum == 180 && a>0 && b>0 && c>0){
               System.out.println("Valid Triangle");
           } else {
               System.out.println("Not a Valid Triangle");
           }
    }
}
