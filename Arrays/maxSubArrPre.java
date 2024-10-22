//THIS PROGRAM IS USED TO PRINT THE TOTAL  SUM OF THE SUBARRAYS ARE PRESENT IN THE GIVEN ARRAY USING PREFIX SUM

//THIS PROGRAM IS USED TO PRINT THE TOTAL  SUM OF THE SUBARRAYS ARE PRESENT IN THE GIVEN ARRAY USING BRUTE FORCE TECHNIQUE

public class maxSubArrPre{
    public static void maxSubArrSum(int arr[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curSum=start==0 ?prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<curSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }
    public static void main(String[] args) {
        int amr[]={1,-2,6,-1,3};
        maxSubArrSum(amr);
    }
}
