public class minValue {
    public static void main(String[] args) {
        int[] arr = { 1, 2,67,43,23,67,66,90,75 };
        int n = arr.length;
        // Method 1 --> Using Integer.MAX_VALUE
        // int mx = Integer.MAX_VALUE;
        // for(int ele:arr){
        //     mn = Math.min(mn,ele);
        // }
        // System.out.println(mn);

        // Method 2 --> Using Math Function
        // int mn = arr[0];
        // for(int i=1;i<n;i++){
        //     mn = Math.min(mn,arr[i]);
        // }
        // System.out.println(mn);

        // Method 3 --> Using Ternary Operator
        int mn = arr[0];
        for(int i=1;i<n;i++){
            mn = mn<arr[i]?mn:arr[i];
        }
        System.out.println(mn);
    }
}