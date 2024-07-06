package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf() 메서드: 다양한 타입을 문자열로 반환
        String numString = String.valueOf(num);
        System.out.println(numString);

        String boolString = String.valueOf(bool);
        System.out.println(boolString);

        String objString = String.valueOf(obj);
        System.out.println(objString);

        String numString2 = " " + num;
        System.out.println(numString2);

        // toCharArray() 메서드: 문자열을 문자 배열로 바꿔줌
        char[] arr = str.toCharArray();
        System.out.println(arr);
        for (char c : arr) {
            System.out.println(c);
        }
    }
}
