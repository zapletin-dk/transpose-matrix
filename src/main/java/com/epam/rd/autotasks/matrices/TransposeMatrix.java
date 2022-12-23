package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int row =matrix[0].length;
        int column = matrix.length;
        int [][]transpositedMatrix = new int[row][column];
        for (int i =0; i < row; i++){
            for (int j =0; j < column; j++){
                transpositedMatrix[i][j] = matrix[j][i];
            }
        }

        return transpositedMatrix;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2, 3},
                {7, -13, 4} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
