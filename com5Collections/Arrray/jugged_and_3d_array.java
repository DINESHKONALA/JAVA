package com5Collections.Arrray;
public class jugged_and_3d_array 
{
    public static void main(String[] arg)
    {
        int[][] jugged_array = new int[3][];
        jugged_array[0] = new int[2]; // First row with 2 elements
        jugged_array[1] = new int[3]; // Second row with 3 elements 
        jugged_array[2] = new int[4]; // Third row with 4 elements

        for(int i = 0; i < jugged_array.length; i++) {
            for (int j = 0; j < jugged_array[i].length; j++) {
                jugged_array[i][j] = i + j; // Assigning values to the elements of the jugged array
                System.out.print(jugged_array[i][j] + " "); // Printing the elements of the jugged array
            }
            System.out.println(); // New line after each row
        }
        System.out.println();

        int[][][] three_d_array = new int[4][4][4]; // first dimension box is 3d array , second dimension box is 2d array and third dimension box is 1d array 
        for(int i = 0; i < three_d_array.length; i++) {
            for (int j = 0; j < three_d_array[i].length; j++) {
                for (int k = 0; k < three_d_array[i][j].length; k++) {
                    three_d_array[i][j][k] = i + j + k; // Assigning values to the elements of the 3D array
                    System.out.print(three_d_array[i][j][k] + " "); // Printing the elements of the 3D array
                }
                System.out.println(); // New line after each row in the 3D array
            }
            System.out.println(); // New line after each layer in the 3D array
        }
    }
    
}

