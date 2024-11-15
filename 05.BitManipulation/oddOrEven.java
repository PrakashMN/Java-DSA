public class oddOrEven {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println( n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }
    }
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(6);
    }
}
