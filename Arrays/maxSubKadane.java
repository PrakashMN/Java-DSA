//THIS PROGRAM IS USED TO PRINT THE TOTAL  SUM OF THE SUBARRAYS ARE PRESENT IN THE GIVEN ARRAY USING BRUTE FORCE TECHNIQUE

public class maxSubKadane {
    public static void kadane(int num[]){
        int cs = 0;
        int ms = 0;
        for(int i=0;i<num.length;i++){
            cs = cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms =Math.max(cs, ms);
        }
        System.out.println("SubSum is : "+ms);
    }
    public static void main(String[] args) {
        int arr[] ={-2,-3,4,-1,-2,1,5,-3};
        kadane(arr);
    }
}