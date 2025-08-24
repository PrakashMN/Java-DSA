/* Second Largest Element in an Array */


public class SecLargeEle {

    public static int secLarge(int arr[]){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        if(arr.length<2){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]>secMax&&arr[i]<max){
                secMax =arr[i];
            }else{
                return -1;
            }
        }
        

        return secMax;
    }
    public static void main(String[] args) {
        int arr[] = {10,10,10};
        int res = secLarge(arr);

        System.out.println("The Second Largest Element is : "+res);
        
    }
}
