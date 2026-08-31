package Lesson4;

import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Take an integer as input: ");
        int n =sc.nextInt();
        int ans =0;

        while(n > 0){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n/10;
        }
        System.out.print("The reversed value is: "+ ans);
    }
}
