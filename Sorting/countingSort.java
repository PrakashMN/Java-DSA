//Counting Sort is a non-comparison-based sorting algorithm. It is particularly efficient when the range of input values is small compared to the number of elements to be sorted.


public class countingSort {
    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0;i<count.length;i++){
            while ((count[i]>0)) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int mrr[]={5,4,1,3,2};
        countSort(mrr);
        printarr(mrr);

    }
}
