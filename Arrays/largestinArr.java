public class largestinArr {
    public static int linearS(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={45,12,13,14,15,16,1};
        int key=14;
        linearS(arr, key);
        if(linearS(arr, key)==-1){
            System.out.println("The search is unsuccesful");
        }
        else{
            System.out.println("The element found at index : "+linearS(arr, key));
        }
    }
}
