package lang.object;

public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}

// Child 클래스는 상속 받을 부모 클래스를 명시적으로 지정했음
// 그러므로 Object 클래스를 상속 받지 않음
