//Spiral Matrix - Given an m x n matrix, return all elements of the matrix in spiral order.

public class spiralMatrix {
    public static void printSpiralMatrix(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length -1;
        int endCol = arr[0].length -1;
        while (startRow<=endRow && startCol<=endCol) {
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.println(arr[startRow][j]+" ");
            }

            //right

            for(int i=startRow+1;i<=endRow;i++){
                System.out.println(arr[i][endCol]+" ");
            }

            //bottem

            for(int j=endCol-1;j>=startCol;j--){
                System.out.println(arr[endRow][j] +" ");
            }

            //left

            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.println(arr[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiralMatrix(matrix);
    }
}
