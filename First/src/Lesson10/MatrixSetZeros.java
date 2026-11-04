package Lesson10;

import java.util.Scanner;

public class MatrixSetZeros {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            int[][] matrix = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            new Solution().setZeroes(matrix);

            for (int[] row : matrix) {
                for (int j = 0; j < row.length; j++) {
                    if (j > 0) System.out.print(" ");
                    System.out.print(row[j]);
                }
                System.out.println();
            }

            scanner.close();
        }
    }

    class Solution {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            boolean isRow = false;
            boolean isCol = false;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                        if (i == 0) isRow = true;
                        if (j == 0) isCol = true;
                    }
                }
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            if (isRow) {
                for (int j = 0; j < n; j++) {
                    matrix[0][j] = 0;
                }
            }

            if (isCol) {
                for (int i = 0; i < m; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    }

