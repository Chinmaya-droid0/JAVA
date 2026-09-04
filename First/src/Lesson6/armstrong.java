package Lesson6;

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         if(armstrong(n)){
             System.out.println("It is An Armstrong Number");
         } else{
             System.out.println("Not an Armstrong Number");
         }


    }

    public static boolean armstrong(int n){
       int digits = (int)Math.log10(n)+1;
       int num =n;
        double ans =0;

        while(n!=0){
            int last = n%10;
            ans = ans +Math.pow(last,digits);
            n=n/10;
        }

        if(num == ans ){
            return true;
        } else{
            return false;
        }

    }
}
