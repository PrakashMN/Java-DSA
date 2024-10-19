//THIS PROGRAM IS USED TO PRINT THE TOTAL SUBARRAYS ARE PRESENT IN THE GIVEN ARRAY

public class printSubarray {
    public static void printSubArr(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.println(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            int subsum=i;
            System.out.println(subsum);
            System.out.println();
        }

        System.out.println("Total Subarrays : "+ts);
    }
    public static void main(String[] args) {
        int amr[]={2,4,6,8,10};
        printSubArr(amr);
    }
}
