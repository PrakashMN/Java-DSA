public class isPalindrome {

    public static boolean iSPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("It is not a palindrome");
                return false;
            }
        }
        System.out.println("It is a palindrome");
        return true;
    }
    public static void main(String[] args) {
        String str = "RACECAR";
        iSPalindrome(str);
    }
}
