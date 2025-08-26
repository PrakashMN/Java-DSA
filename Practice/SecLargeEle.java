/* The program to find the second largest element in an array */

public class SecLargeEle {
    public static int secLarge(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        if(arr.length<2){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]>secmax&&arr[i]<max){
                secmax = arr[i];
            }
        }
        if(secmax==Integer.MIN_VALUE){
                return -1;
            }
        
        return secmax;
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int res = secLarge(arr);

        System.out.println("The Second Largest Element is : " + res);
        

    }
}