package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception{
        // Class helloClass = Hello.class; 1. 클래스로 조회
        Class helloClass = Class.forName("lang.clazz.Hello"); // 3. 문자열로 조회
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}

// Class 클래스를 사용하면 클래스의 메타 정보를 기반으로
// 클래스에 정의된 메서드, 필드, 생성자 등을 조회할 수 있음
// 이들을 통해 객체 인스턴스를 생성하거나 메서드를 호출하는 작업을 할 수 있음
// 이러한 작업을 리플렉션이라고 함
