package Lesson10;

import org.w3c.dom.ls.LSOutput;

public class TwoDArrayDemo {
    static void main() {
        int [][] a = new int[3][4];

        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a.length);
        System.out.println(a[0].length);

        System.out.println(a[1][2]);

        //set
        a[2][3] =10;
        System.out.println(a[2][3]);

        int [][] b = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i =0; i < b.length; i++){
            for(int j =0; j < b[i].length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        //Another way
        for(int[] val : b){
            for(int temp : val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }

        //Jagged 2D Array
        int [][] arr = new int[3][];

        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[5];

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);

    }

}
