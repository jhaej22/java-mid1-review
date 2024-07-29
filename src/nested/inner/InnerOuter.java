package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3; // 클래스(정적) 변수
    private int outInstanceValue = 2; // 인스턴스(멤버) 변수

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            System.out.println(innerInstanceValue);
            // 자신의 멤버 변수에 접근

            System.out.println(outInstanceValue);
            // 바깥 클래스의 인스턴스(멤버) 변수에 접근 가능

            System.out.println(InnerOuter.outClassValue);
            // 바깥 클래스의 정적변수(클래스 변수)에 접근 가능
        }
    }
}
