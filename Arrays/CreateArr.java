import java.util.Scanner;

public class CreateArr {
    public static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements one by one");
  
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
     }

     public static void printarr(int arr[]){
        System.out.println("Array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
     }
    public static void main(String[] args) {
        int marks[]=new int[5];
        input(marks);
        printarr(marks);
        int numbers[]={5,8,12,15,17};
        printarr(numbers);
    }
}
