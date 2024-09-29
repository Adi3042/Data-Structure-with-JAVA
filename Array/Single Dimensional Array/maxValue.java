public class maxValue {
    public static void main(String[] args) {
        int[] arr = { 1, 2,67,43,23,67,66,90,75 };
        int n = arr.length;
        // Method 1 --> Using Integer.MIN_VALUE
        // int mx = Integer.MIN_VALUE;
        // for(int ele:arr){
        //     mx = Math.max(mx,ele);
        // }
        // System.out.println(mx);

        // Method 2 --> Using Math Function
        // int mx = arr[0];
        // for(int i=1;i<n;i++){
        //     mx = Math.max(mx,arr[i]);
        // }
        // System.out.println(mx);

        // Method 3 --> Using Ternary Operator
        int mx = arr[0];
        for(int i=1;i<n;i++){
            mx = mx>arr[i]?mx:arr[i];
        }
        System.out.println(mx);
    }
}
