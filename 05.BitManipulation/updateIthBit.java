//This method update the requared bit at requared position

public class updateIthBit {
    public static int clearithbit(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int setithbit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int updateithbit(int n,int i,int newBit){
        if(newBit==0){
            return clearithbit(n, i);
        }
        else{
            return setithbit(n,i);
        }
    }
    public static void main(String[] args) {
    System.out.println(updateithbit(5, 2, 0));
    }
}
