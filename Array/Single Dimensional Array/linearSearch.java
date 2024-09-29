public class linearSearch {
    public static void main(String[] args) {
        //O(n) time complexity --> Linear Search  --> Optimized Approach
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        boolean flag = false;
        for(int ele:arr){
            if(ele==target){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
}
