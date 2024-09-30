// Sort the array of 0s, 1s and 2s
public class sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 0, 1, 2};
        printArray(arr);
        int n = arr.length;

        // Method 1 --> Bruteforce
        // bruteforceSortColors(arr,n);
        // printArray(arr);

        // Method 2 --> Dutch National Flag Algorithm(Optimal)
        optimalSortColors(arr,n);
        printArray(arr);

        
       
    }
    public static void bruteforceSortColors(int[] arr,int n){
        int noOfZeroes = 0, noOfOnes = 0;
        for(int ele:arr){
            if(ele==0) noOfZeroes++;
            else if(ele==1) noOfOnes++;
        }
        for(int i=0;i<n;i++){
            if(i<noOfZeroes) arr[i] = 0;
            else if(i<noOfOnes+noOfZeroes) arr[i] = 1;
            else arr[i] = 2;
        }
    }
    public static void optimalSortColors(int[] arr,int n){
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid, low);
                low++; mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] arr, int mid, int low){
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low] = temp;
    }
    public static void printArray(int[] arr){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}