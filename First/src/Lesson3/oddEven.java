package Lesson3;
 import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("It is an Even number");
        } else {
            System.out.println("It is an Odd number");
        }
    }
}
