import java.util.Arrays;

public class sort0and1{
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,0,1,1,1,0,1,1,0,1,0,0,0,1};
        // Method -1 --> Using Built-in sort function
        // Arrays.sort(arr);

        // Method -2 --> Using Two Pass Solution
        // int noOfZeroes = 0;
        // for(int ele:arr){
        //     if(ele==0){
        //         noOfZeroes++;
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(i<noOfZeroes) arr[i] = 0;
        //     else arr[i] = 1;
        // }

        // Method -3 --> Using Single Pass Solution
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else{
                arr[i] = 0;
                arr[j] = 1;
                i++; j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}