package Lesson10;

public class Transpose {
    static void main() {
        int [][] original = {
                {1,2,3},
                {4,5,6}
        };

        int rows = original.length;
        int cols = original[0].length;

        int [][] transpose = new int[cols][rows];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[j][i] = original[i][j];
            }
        }

        System.out.println("Transpose :");
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j< transpose[i].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
