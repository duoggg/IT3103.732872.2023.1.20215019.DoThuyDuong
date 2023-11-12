package hust.soict.dsai.lab01;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.print("n = ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int arr[] = new int[n];
        
        System.out.print("Enter array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];     // cap nhat tong
        }
        // sort 
        for(int i = 0; i< n; i++) {
            for(int j = 1; j < n; j++ ) {
                if(arr[j] < arr[j-1]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.print("Sorted Array : ");
        for(int i=0; i< n; i++) System.out.print(arr[i] + " ");
        System.out.println("\nSum of array is: " + sum);
        System.out.println("Average of array is: " + (sum * 1.0 / n ));
        scanner.close();
        System.exit(0);
    }
}