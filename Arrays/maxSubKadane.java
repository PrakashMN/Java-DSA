//THIS PROGRAM IS USED TO PRINT THE TOTAL  SUM OF THE SUBARRAYS ARE PRESENT IN THE GIVEN ARRAY USING BRUTE FORCE TECHNIQUE

import java.util.Scanner;

public class maxSubKadane {
    public static void input(int arr[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
    public static void kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs,ms);
        }

        System.out.println("Maximum Sub Array Sum : "+ms);
    }
    public static void main(String[] args) {
        int numbers[]=new int[55];
        System.out.println("Enter the Array numbers : ");
        input(numbers);
        kadanes(numbers);
    }
}
