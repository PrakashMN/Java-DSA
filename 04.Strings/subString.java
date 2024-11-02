//substring is a part of a string or a subset of the string

public class subString {
    public static String SubString(String str,int si,int ei){
        String substr = "";
        for(int i = si;i<ei;i++){
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(SubString(str, 3, 5));
        String str2 = "HelloWorld";
        System.out.println("This is using inbuilt function");
        System.out.println(str2.substring(3,5));//Using inbuilt function
    }
}
