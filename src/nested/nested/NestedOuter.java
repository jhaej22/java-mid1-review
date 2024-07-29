package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3; // 정적 변수(클래스 변수)
    private int outInstanceValue = 2; // 인스턴스 변수(멤버 변수)

    // 정적 중첩 클래스(static nested class)
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {

            System.out.println(nestedInstanceValue);
            // 자신의 멤버 변수에 접근
            //System.out.println(outInstanceValue);
            // 바깥 클래스의 인스턴스 멤버에는 접근 불가능
            // 두 클래스는 다른 인스턴스 소속이기 때문에
            System.out.println(NestedOuter.outClassValue);
            // 바깥 클래스의 클래스 변수에는 접근 가능
        }
    }
}
