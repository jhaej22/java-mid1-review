package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int localVar = 1;

        // 익명 클래스 (지역 클래스의 한 종류)
        // 클래스 이름 생략 가능 && 선언과 생성 동시에 가능
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println(value);
                System.out.println(localVar);
                System.out.println(paramVar);
                System.out.println(outInstanceVar);
            }
        };

        printer.print();
        System.out.println(printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}

// 익명 클래스(이름이 없는 지역 클래스)
// 선언과 생성 동시에
// new 다음에 바로 상속 받으면서 구현할 부모 타입을 입력함
// 부모 클래스를 상속받거나 인터페이스를 구현해야함
// 인스턴스는 한번만 생성할 수 있음
