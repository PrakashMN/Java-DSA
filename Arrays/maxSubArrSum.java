//THIS PROGRAM IS USED TO PRINT THE TOTAL  SUM OF THE SUBARRAYS ARE PRESENT IN THE GIVEN ARRAY

public class maxSubArrSum{
    public static void maxSubArrSum(int arr[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curSum=0;
                for(int k=start;k<=end;k++){
                    curSum+=arr[k];
                }
                System.out.println(curSum);
                if(maxSum<curSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }
    public static void main(String[] args) {
        int amr[]={2,4,6,8,10};
        maxSubArrSum(amr);
    }
}
