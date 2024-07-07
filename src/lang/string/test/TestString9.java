package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] arr = email.split("@");

        String id = arr[0];
        String domain = arr[1];
        System.out.println("ID: " + id);
        System.out.println("Domain: " + domain);
    }
}
