/* 
   Ex    : Add two matrix
   author : Do Thuy Duong 20215019
   ClassID: 732872 
 */
package hust.soict.dsai.lab01;

import java.util.Scanner;
public class AddTwoMatrix {
    // Show matrix
    private static void show(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) 
                System.out.print(mat[i][j] + " ");
            
            System.out.println();
        }
    }

    // Calculate sum of two matrix
    private static int[][] calSum(int[][] A, int[][] B, int n, int m){
        int[][] C = new int[n][m];
        for(int i = 0; i<n ;i++) {
            for (int j= 0; j<m;j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Row =  ");
        int n = scanner.nextInt();
        System.out.print("Column = ");
        int m = scanner.nextInt();

        // Enter 1st maxtrix
        int[][] matrix1 = new int[n][m];
        System.out.print("First matrix: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("A[%d][%d] = ", i+1, j+1);
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Enter 2nd maxtrix
        int[][] matrix2 = new int[n][m];
        System.out.print("Second matrix: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("B[%d][%d] = ", i+1 , j+1);
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("First matrix: ");
        show(matrix1);
        System.out.println("Second matrix: ");
        show(matrix2);
        System.out.println("Sum of two matrix: ");
        show(calSum(matrix1,matrix2,n,m));
        scanner.close();
    }
}