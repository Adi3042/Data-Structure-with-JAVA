public class secondMaximum {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2,7,5,90,87,54};
        int mx = Integer.MIN_VALUE;
        int smx = Integer.MIN_VALUE;
        for(int ele:arr){
            if(ele>mx){
                smx = mx;
                mx = ele;
            }else if(ele>smx && ele!=mx){
                smx = ele;
            }
        }
        System.out.println("Maximum Value: "+mx);
        System.out.println("Second Maximum Value: "+smx);
    }
}
