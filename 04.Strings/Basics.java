//Basics of String
//01) Input , Output
//02) String Length
//03) String Concatination
//04) String charAt Method

public class Basics {
    public static void printLetters(String name){
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
    public static void main(String[] args) {
        /* char arr[]={'a','b','c','d'};
        String str1="Prakash";
        String str2=new String("Prakash");
        System.out.println("Enter your name");

        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.length()); */

        //concatination

        String Fname="Prakash";
        String Lname="Nagaral";
        String name = Fname+Lname;
        printLetters(name);
    } 
}
