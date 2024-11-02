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
