public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int n = arr.length;
        // Method - 1 --> with using extra space --> swapping

        // for(int i =0;i<n/2;i++){
        //     int j = n-i-1;
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }

        // Method - 2 --> Using without extra space --> 2 pointer approach
        int i =0, j=n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        System.out.println("Array after reversing: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
