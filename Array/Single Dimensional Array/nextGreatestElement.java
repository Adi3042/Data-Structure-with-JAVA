public class nextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12, 8, 60, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
        int[] ans = new int[n];

        // Method - 1 --> Bruteforce Method
        // bruteforce(arr, ans, n);
        // printArray(ans);

        // Method - 2 --> Optimal Approach
        optimalSol(arr, ans, n);
        printArray(ans);
    }

    public static void optimalSol(int[] arr, int[] ans, int n) {
        ans[n - 1] = -1; 
        int nge = arr[n - 1]; 
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = nge; 
            nge = Math.max(nge, arr[i]); 
        }
    }

    public static void bruteforce(int[] arr, int[] ans, int n) {
        ans[n - 1] = -1; 
        for (int i = 0; i < n - 1; i++) {
            int mx = Integer.MIN_VALUE;
            for (int j = i + 1; j < n; j++) {
                mx = Math.max(mx, arr[j]);
            }
            ans[i] = mx;
        }
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
