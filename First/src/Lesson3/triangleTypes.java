package Lesson3;

import java.util.Scanner;
public class triangleTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int a = input.nextInt();
        System.out.print("Enter side 2: ");
        int b = input.nextInt();
        System.out.print("Enter side 3: ");
        int c = input.nextInt();

        if(a+b <= c || b+c <= a || a+c <= b ){
            System.out.println("Not a valid Triangle");
        } else if((((a * a) + (b * b)) == (c * c)) || (((b * b) + (c * c)) == (a * a)) || (((a * a) + (c * c) == (b * b)))){
            System.out.println("Right-angled Triangle");
        } else if(a == b && b == c){
            System.out.println("Equilateral Triangle");
        } else if( a== b || b == c || c == a){
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

    }

}
