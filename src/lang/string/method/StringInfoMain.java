package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        System.out.println(" ".isBlank());
        System.out.println(str.charAt(7));
    }
}

// isEmpty() : 문자열이 비어있는지
// isBlank() : 문자열이 비어있거나 공백인지
