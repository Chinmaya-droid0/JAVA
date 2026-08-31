package Lesson3;

import java.util.Scanner;
public class MaxAmongThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>=b && a>= c){
            System.out.println("First one is the Largest");
        } else if(b>=a && b>=c){
            System.out.println("Second one is the Largest");
        } else {
            System.out.println("Third one is the Largest ");
        }
    }
}
