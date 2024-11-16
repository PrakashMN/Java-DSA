// As per name this method clears last i bits

public class clearLastIbits {
    public static int clearlastibits(int n,int i){
        int bitMask = (-1)<<i;
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearlastibits(15, 2));
    }
}
