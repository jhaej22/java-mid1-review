package nested.anonymous.ex;

import java.util.Random;

/**
 * 람다
 * : 매개변수(인수)에 메서드를 전달할 수 있는 것
 */

public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        hello(() -> {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
        });


        hello(() -> {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
        });
    }
}
// 클래스나 인스턴스를 정의하여 참조값을 메서드에 전달하는 것이 아니라
// 코드 블럭을 직접 전달함

