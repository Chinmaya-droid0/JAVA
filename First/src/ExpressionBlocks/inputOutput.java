package ExpressionBlocks;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        //Create an object of the Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int number = input.nextInt();
        System.out.println("The value is: " + number);


        //FloatingPoint
        float myFloat = input.nextFloat();

        double myDouble = input.nextDouble();

        String myString = input.next();

        // next() -> read a single word from the user
        // nextLine() -> reads a line of text from the user

        System.out.println(myFloat+ " " + myDouble + " " + myString);

    }
}
