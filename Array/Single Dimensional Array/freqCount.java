import java.util.Arrays;
public class freqCount {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,3,4,9,0,8,5,7,6,12,43,2,5,34,21};
        int target = 6,count = 0;
        Arrays.sort(arr);
        for(int ele:arr){
            if(ele>target){
                count++;
            }
        }
        System.out.println("Frequency of elements greater than "+target+" is: "+count);
        
    }
}
