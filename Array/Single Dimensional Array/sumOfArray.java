public class sumOfArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int ele:arr){
            sum += ele;
        }
        System.out.println("Sum of array is: "+sum);
    }
}