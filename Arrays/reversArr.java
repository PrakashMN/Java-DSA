// PRINTS THE ARRAY IN REVERSE ORDER

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
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={4,12,25,84,1,32,65};
        reverseArr(nums);
        sc.close();
    }
}
