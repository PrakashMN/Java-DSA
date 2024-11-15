public class oddOrEven {
    public static void oddorEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println( n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }
    }
    public static void main(String[] args) {
        oddorEven(5);
        oddorEven(6);
    }
}
