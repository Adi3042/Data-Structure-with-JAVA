public class secondMinimun {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2,7,5,90,87,54};
        int mn = Integer.MAX_VALUE;
        int smn = Integer.MAX_VALUE;
        for(int ele:arr){
            if(ele<mn){
                smn = mn;
                mn = ele;
            }else if(ele<smn && ele!=mn){
                smn = ele;
            }
        }
        System.out.println("Minimum Value: "+mn);
        System.out.println("Second Minimum Value: "+smn);
    }
}
