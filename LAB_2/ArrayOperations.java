// Q1. WAP in java to perform following operations with the concept arrays:
// 1 find minimum and maximum value in an arrays
// 2. reverse a string
// 3. transpose of a matrix
// 4. multiplication of 2 matrix


import java.util.Arrays;

public class ArrayOperations {

    // Function to find minimum and maximum value in an array
    static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    // Function to reverse a string
    static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    // Function to find transpose of a matrix
    static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    // Function to perform multiplication of two matrices
    static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] resultMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public static void main(String[] args) {
        // Test the functions
        int[] array = {5, 3, 9, 1, 7};
        findMinMax(array);

        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] transposedMatrix = transposeMatrix(matrix);
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);

        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("Matrix Multiplication Result:");
        printMatrix(resultMatrix);
    }

    // Helper function to print a matrix
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}




// public class ArrayOperations{
//     public static void main(String[] args){
        
//     }
// }