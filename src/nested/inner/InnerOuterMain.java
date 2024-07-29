package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        // 내부 클래스는 바깥 클래스의 인스턴스에 소속
        // 바깥 클래스의 인스턴스 정보를 알아야 생성할 수 있음

        inner.print();
        System.out.println("innerClass = " + inner.getClass());
    }
}
