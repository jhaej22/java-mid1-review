package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {

    public static void helloDice() {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " + randomValue);
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void helloSum() {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}

// 앞의 리펙토링과 다르게 단순히 변하는 문자열을 외부에서 전달하는 것이 아니라
// 코드 조각을 전달해야 한다.