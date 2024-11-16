// Thi smethod checks the given number is power of 2 or not

public class powerOf2OrNot {
    public static boolean Pof2ON(int n){
        return(n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(Pof2ON(4));
    }
}
