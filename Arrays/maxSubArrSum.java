public class maxSubArrSum {
    public static void maxsubsum(int arr[]){
        int curr = 0;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            int st = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                curr = 0;
                for(int k=st;k<=end;k++){
                    curr += arr[k];
                }
                System.out.println(curr);
                if(curr>max){
                    max = curr;
                }

            }
        }
        System.out.println("max is : "+max);
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        maxsubsum(arr); 
    }
}