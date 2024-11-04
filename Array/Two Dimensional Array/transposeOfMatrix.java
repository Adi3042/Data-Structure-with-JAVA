public class transposeOfMatrix {

    public static void main(String[] args) {
        int[][] arr1 = {{12,34,20},{15,91,15},{64,63,96}};
        int m = arr1.length;
        int n = arr1[0].length;
        int[][] transpose = new int[m][n];
        print(arr1, m, n);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
               transpose[i][j] = arr1[j][i];
            }
        }
        System.out.println("Transpose of ");
        print(transpose, m, n);

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