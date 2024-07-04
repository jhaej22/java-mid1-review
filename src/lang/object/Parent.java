package lang.object;

public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}

// Parent 클래스는 상속하는 부모 클래스가 없음
// 부모가 없으면 묵시적으로 Object 클래스를 상속 받음
