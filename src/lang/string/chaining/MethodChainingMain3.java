package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
// add() 메서드를 호출하면 인스턴스 자신의 참조값이 반환됨
// 반환된 참조값을 변수에 담아두지 않고 바로 사용하여 메서드를 호출
// 메서드 체이닝: . 을 찍어서 계속 메서드를 호출하는 방법
// -> 메서드가 자기 자신의 참조값을 반환하기 때문에 가능함
