//  PROGRAM TO FIND AN ELEMENT THROUGH BinarySearch

import java.util.Scanner;

public class binarySearch {

    public static void input(int arr[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }

    public static int binaryS(int arr[],int key){
        int st=0;
        int end=arr.length-1;
        while (st<=end) {
            int mid=st+end/2;
            if(key>arr[mid]){
                st=mid+1;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int h=sd.nextInt();
        int arr[]=new int[h];
        System.out.println("Enter the Array in Increasing order");
        input(arr);
        System.out.println("Enter the key needed to search");
        int key=sd.nextInt();
        int ju = binaryS(arr, key);
        if(ju==-1){
            System.out.println("Element not present");
        }
        else{
            System.out.println("Element Present at index : "+binaryS(arr, key));
        }
    }
}
