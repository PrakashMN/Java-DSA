import java.util.Scanner;

public class largeAndSmall {
    public static void inputarr(int arr[][]){
        int n=3,m=3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements one by one");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }

    public static void largest(int arr[][]){
        int m=3,n=3;
        int large = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>large){
                    large=arr[i][j];
                }
            }
        }
        System.out.println("Largest element is : "+large);
    }

    public static void smallest(int arr[][]){
        int m=3,n=3;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]<small){
                    small=arr[i][j];
                    
                }
            }
        }
        System.out.println("Smallest element is : "+small);

    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        inputarr(matrix);
        largest(matrix);
        smallest(matrix);
    }
}
