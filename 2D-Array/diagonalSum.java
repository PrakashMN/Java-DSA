//Matrix Diagonal Sum - Given a square matrix mat, return the sum of the matrix diagonals.

public class diagonalSum {

    public static int DiagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("The diagonal sum is : "+DiagonalSum(matrix));
    }
}
