// This method finds the Exponential of given numbers in Less time complexity

public class fastExponentiation {
    public static int FastExponentiation(int a, int n){
        int ans = 1;

        while (n>0) {
            if((n&1)!=0){
                ans = ans *a;
            }
            a=a*a;
            n = n>>1;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(FastExponentiation(6, 5));
    }
}
