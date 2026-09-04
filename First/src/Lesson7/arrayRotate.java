package Lesson7;

import java.sql.SQLOutput;
import java.util.Scanner;
public class arrayRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Now enter the Array: ");
        for(int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        rotate(arr, k);


    }

    public static void rotate(int[] arr, int k) {
        int length = arr.length;

        if (length == 0 ){
            return;
        }

        k = k % length;

        if (k < 0) {
            k = k + length;
        }

        for (int r = 1; r <= k; r++) {
            int temp = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
