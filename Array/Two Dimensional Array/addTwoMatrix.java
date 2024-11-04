public class addTwoMatrix {

    public static void main(String[] args) {
        int[][] arr1 = {{12,34,20},{15,91,15},{64,63,96}};
        int[][] arr2 = {{2,3,0},{5,1,1},{4,3,6}};
        int m = arr1.length;
        int n = arr1[0].length;
        int[][] res = new int[m][n];
        print(arr1, m, n);
        print(arr2, m, n);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                res[i][j] = arr1[i][j]+ arr2[i][j];
            }
        }
        System.out.println("Sum of both matrix");
        print(res, m, n);

    }

    public static void print(int[][] arr, int m, int n){
        System.out.println("Array is =");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}