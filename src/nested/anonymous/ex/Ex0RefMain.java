package nested.anonymous.ex;

public class Ex0RefMain {

    public static void hello(String str) {
        System.out.println("프로그램 시작"); // 변하지 않는 부분은 그대로 유지
        System.out.println(str);
        // 상황에 따라 변하는 문자열 데이터를 외부에서 전달 받아서 출력하면 됨
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("hello Java");
        hello("hello Spring");
    }
}
