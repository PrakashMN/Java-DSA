import java.util.Scanner;

public class pairsinArr {

    public static void printpairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+curr+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,6,8,10};
        printpairs(arr);
    }
}
