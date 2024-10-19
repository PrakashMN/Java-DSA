//THIS PROGRAM IS USED TO PRINT THE TOTAL SUBARRAYS ARE PRESENT IN THE GIVEN ARRAY

public class printSubarray {
    public static void printSubArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.println(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int amr[]={2,4,6,8,10};
        printSubArr(amr);
    }
}
