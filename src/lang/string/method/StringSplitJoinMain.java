package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split() 메서드 이용 : 문자열 분리
        String[] arr = str.split(",");
        for (String s : arr) {
            System.out.println(s);
        }

        // join() 메서드 이용: 문자열 합침
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println(joinedStr);

        // 분리된 문자열 배열 -> 문자열로 합침
        String result = String.join("-", arr);
        System.out.println(result);
    }
}
