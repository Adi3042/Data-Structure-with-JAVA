public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int m = arr1.length, n = arr2.length;
        int[] arr3 = new int[m+n];
        int i=0,j=0,k=0;
        // Merging two sorted arrays
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            }else{
                arr3[k++] = arr2[j++];
            }
        }
        if(i==m){
            while(j<n){
                arr3[k++] = arr2[j++];
            }
        }
        if(j==n){
            while(i<m){
                arr3[k++] = arr1[i++];
            }
        }
        for(int ele:arr3){
            System.out.print(ele+" ");
        }
    }
}
