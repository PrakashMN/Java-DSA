// The StringBuilder class in Java is used to create mutable sequences of characters. Unlike the String class, which creates immutable sequences, StringBuilder allows for modifications without creating new objects.

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch ='a';ch<= 'z';ch++){
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
