// Rotate the Array by k steps, where k is non-negative and k can be greater than the length of the array.
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close(); 
        k = k % n; // If k is greater than n, then k = k % n

        reverseArray(arr, 0, n - k - 1);
        printArray(arr);
        reverseArray(arr, n - k, n - 1);
        printArray(arr);
        reverseArray(arr, 0, n - 1);
        printArray(arr);
    }

    public static void reverseArray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}