//THIS PROGRAM IS USED TO PRINT THE TOTAL  SUM OF THE SUBARRAYS ARE PRESENT IN THE GIVEN ARRAY USING BRUTE FORCE TECHNIQUE

public class maxSubKadane {
    public static void kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs,ms);
        }

        System.out.println("Maximum Sub Array Sum : "+ms);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
