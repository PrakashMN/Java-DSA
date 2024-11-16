//this function is used to clear a specific bit in a number

public class clearIthBit {
    public static int clearithbit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearithbit(10, 1));
    }
}
