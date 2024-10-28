//Insertion sort is a straightforward sorting algorithm that builds a sorted array one element at a time by comparing each new element to the already sorted elements and inserting it in the correct position.

public class insertionSort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=curr;
        }
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int brr[]= {5,4,1,3,2};
        insertion(brr);
        printarr(brr);

    }
}
