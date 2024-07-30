package nested.anonymous.ex;

import java.util.Random;

/**
 *  익명 클래스를 이용하여 리팩토링
 *  + 참조값을 변수에 담아두지 않고 인수로 바로 전달
 */

public class Ex1RefMainV4 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        hello(new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });


        hello(new Process() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}

