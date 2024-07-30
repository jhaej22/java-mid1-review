package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3; // 인스턴스 변수(멤버 변수)

    public void process(int paramVar) {

        int localVar = 1; // 지역 변수

        // 지역 클래스
        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println(value); // 자신의 멤버 변수에 접근
                System.out.println(localVar); // 바깥 클래스의 지역 변수에 접근(자신이 속한 코드블럭 안)
                System.out.println(paramVar); // 바깥 클래스의 매개 변수에 접근 (자신이 속한 코드블럭 안)
                System.out.println(outInstanceVar); // 바깥 클래스의 멤버 변수에 접근
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData(); // 지역 클래스(내부 클래스)의 인스턴스 생성
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1(); // 바깥 클래스 인스턴스 생성
        localOuter.process(2);
    }
}
