/*Input 2 3 3 2
        1 2 3 4 5 6
        7 8 9 10 11 12 */
//Output 58 64 139 154

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowM1 = sc.nextInt();
        int colM1 = sc.nextInt();
        int rowM2 = sc.nextInt();
        int colM2 = sc.nextInt();

        // Check if calculable
        if (colM1 != rowM2) {
            System.out.println("Invalid");
            sc.close();
            return;
        }

        // Create 2D array for matrix 1 and 2
        int[][] m1 = new int[rowM1][colM1];
        int[][] m2 = new int[rowM2][colM2];

        // Use scanner to receive value for each matrix
        for (int i=0; i<rowM1; i++) {
            for (int j=0; j<colM1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<rowM2; i++) {
            for (int j=0; j<colM2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Create new result matrix
        int[][] result = new int[rowM1][colM2];
        for (int i=0; i<rowM1; i++) {
            for (int j=0; j<colM2; j++) {
                int sum = 0;
                for (int k=0; k<colM1; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                result[i][j] = sum;
            }
        }

        // Display the result
        for (int i=0; i<rowM1; i++) {
            System.out.print("[");
            for (int j=0; j<colM2; j++) {
                System.out.print(result[i][j] + " , ");
            }
            System.out.println("]");
        }
    }
}

// The code is solely implemented by thetkpark(GitHub), CS@SIT KMUTT Senior