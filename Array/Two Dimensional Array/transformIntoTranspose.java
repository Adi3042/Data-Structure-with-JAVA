public class transformIntoTranspose{
    public static void print(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void swap(int[][] arr, int i, int j, int k, int l) {
        int temp = arr[i][j];
        arr[i][j] = arr[k][l];
        arr[k][l] = temp;
    }

    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int n =arr.length;
        System.out.print("Original Array:");
        print(arr);
        for(int i =0;i<n;i++){
            for(int j =0;j<i;j++){
                swap(arr, i, j, j, i);            
            }
        }
        System.out.print("New Array:");
        print(arr);
    }
}