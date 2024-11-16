//This method counts the total number of binary 1's in give number

public class countSetBits {
    public static int countSetbits(int n){
        int count = 0;
        while (n>0) {
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetbits(10));
    }
}
