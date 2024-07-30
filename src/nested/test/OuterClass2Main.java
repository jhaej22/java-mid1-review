package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
        // 내부 클래스의 인스턴스를 생성하기 위해서는
        // 반드시 먼저 바깥 클래스의 인스턴스를 생성해야함
        // 바깥클래스명.내부클래스명 참조형 변수 = 바깥클래스 참조값.new 내부클래스명
    }
}
