//This method clears a defined range of bits

public class clearRangeOfbits {
    public static int clearIbits(int n,int i,int j){
        int a= ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIbits(10, 2, 4));
    }
}
