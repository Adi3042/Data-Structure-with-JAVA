public class sumOfElements {

    public static void main(String[] args) {
        int[][] arr = {{12,34,20},{15,91,15},{64,63,96}};
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;
        System.out.println("Array is = ");
        print(arr, m, n);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of each elements is = "+sum);

    }

    public static void print(int[][] arr, int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}