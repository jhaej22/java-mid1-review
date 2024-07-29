package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter(); // 바깥 클래스 인스턴스
        NestedOuter.Nested nested = new NestedOuter.Nested(); // 정적 중첩 클래스 인스턴스
        nested.print();
        System.out.println("nestedClass = " + nested.getClass());
    }
}
