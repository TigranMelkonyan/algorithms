package com.tigran.test_tasks.other;

import java.util.Arrays;

/**
 * Created by Tigran Melkonyan
 * Date: 2/16/25
 * Time: 12:36 PM
 */
/*
You are given an image, represented as a matrix of integers, where each integer corresponds to a color. 
The number in the ith (0-based) row and jth (0-based) column represents the color of the pixel in the ith row and 
jth column of the image.
Your task is to increase the sharpness of the image. In order to do that, you need to replace each number of the 
matrix with the average of the numbers in the neighboring cells. We assume that two cells are neighbors if they share
at least one corner. The cell itself is not considered part of the average; only the 8 surrounding 
neighbours (or fewer if the cell is against an edge).
*/
public class ImageSharpening {
    public static void main(String[] args) {
        int[][] image = {
                {100, 200, 150},
                {50, 100, 75},
                {200, 50, 100}
        };

        int[][] sharpenedImage = sharpenImage(image);
        printMatrix(sharpenedImage);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }


    public static int[][] sharpenImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        int[][] result = new int[rows][cols];

        int[][] directions = {
                {-1, 0}, // Up
                {1, 0}, // Down
                {0, -1}, // Left
                {0, 1}, // Right
                {-1, -1}, // Up-Left
                {-1, 1}, // Up-Right
                {1, -1}, // Down-Left
                {1, 1}  // Down-Right
        };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                int count = 0;

                for (int[] dir : directions) {
                    int ni = i + dir[0];
                    int nj = j + dir[1];

                    if (ni >= 0 && ni < rows && nj >= 0 && nj < cols) {
                        sum += image[ni][nj];
                        count++;
                    }
                }

                result[i][j] = count > 0 ? sum / count : image[i][j];
            }
        }
        return result;
    }
}
