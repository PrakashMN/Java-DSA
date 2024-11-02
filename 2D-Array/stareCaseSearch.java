/* Staircase search is one of the efficient searching algorithms to find a key value in a given 2-dimensional array.
 In this, we first move to the last element of the first row and check if the key is less than the last element then we move to the left of the last element.
 If the key is greater than the last element then we move to the next row the last element and again check if the key is less than the last element.
 If we found a key equals to the element of the array then we stop searching further and print the element.
 This algorithm leads to reduces a lot of time as compared to the normal searching algorithm in the array. */

public class stareCaseSearch {
    public static boolean stareCase(int arr[][],int key){
        int row=0, col = arr[0].length-1;
        while (row<arr.length && col>=0) {
            if(arr[row][col]==key){
                System.out.println("Your key found at :"+"("+row+","+col+")");
                return true;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrx[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48,},{32,33,39,50}};
        int key = 10;
        stareCase(matrx, key);
    }
}
