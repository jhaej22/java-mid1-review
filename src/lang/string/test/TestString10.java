package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] arr = fruits.split(",");
        for (String s : arr) {
            System.out.println(s);
        }

        String joinedString = String.join("->", arr);
        System.out.println("joinedString = " + joinedString);
    }
}
