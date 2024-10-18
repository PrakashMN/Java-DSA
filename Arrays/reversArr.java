import java.util.Scanner;

public class reversArr {

    public static void reverseArr(int arr[]){
        int first=0,last=arr.length-1;
        while (first<last) {
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={4,12,25,84,1,32,65};
        reverseArr(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
        System.out.println();
    }
}
