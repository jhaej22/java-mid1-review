package nested.local;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println(value);
                System.out.println(localVar);
                System.out.println(paramVar);
                System.out.println(outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter(); // 이미 생성될 때 필요한 지역 변수 캡쳐
        // 만약 지역 클래스가 자신이 사용하는 지역 변수를 캡쳐한 뒤에 지역변수를 바꾼다면?
        // localVar = 10;
        // paramVar = 20; -> 컴파일 오류
        // 지역 클래스의 인스턴스 생성 이후에 지역 변수의 값을 변경하게 되면
        // 스택 영역에 존재하는 값과 인스턴스에 캡쳐한 값이 서로 달라지는 동기화 문제 발생
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        printer.print();
    }
}
