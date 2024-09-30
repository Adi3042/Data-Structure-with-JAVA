// Find the doublet in the array whose sum is equal to the given sum(Two Sum). --> Question LeetCode 8
public class doubletSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int sum = 16;

        // Method - 1 --> Brute Force
        findDoubletSum(arr, sum);

        // Method - 2 --> Optimized Approach
        int[] result = doubletSumOptimized(arr, sum);
        if (result[0] != -1) {
            System.out.println("The pair is: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No such pair found");
        }
    }

    public static int[] doubletSumOptimized(int[] arr, int sum) {
        int n = arr.length;
        int[] ans = new int[2];
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (flag) {
            return ans;
        }
        return new int[]{-1, -1}; // If no such pair found
    }

    public static void findDoubletSum(int[] arr, int sum) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("The pair is: " + arr[i] + " " + arr[j]);
                    return;
                }
            }
        }
        System.out.println("No such pair found");
    }
}