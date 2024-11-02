import java.util.Scanner;

public class creation {

    public static void inputarr(int arr[][]){
        int m=3,n=3;
        Scanner sn =new Scanner(System.in);
        System.out.println("Enter Element one by one");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sn.nextInt();
            }
            System.out.println();
        }
        sn.close();
    }

    public static void printarr(int arr[][]){
        int m=3,n=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Searcharr(int arr[][],int key){
        int m=3,n=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==key){
                    System.out.println("The element is at index "+"("+ i +","+ j +")");
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        int matric[][]=new int[3][3];
        inputarr(matric);
        printarr(matric);
        System.out.println("Enter key to Search");
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();
        Searcharr(matric, key);
        sc.close();
        
    }



}
