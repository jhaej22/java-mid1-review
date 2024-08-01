package exception.basic.checked;

public class Client {
        public void call() throws MycheckedException {
            throw new MycheckedException("ex");
    }
// throw 예외: 새로운 예외를 발생시킬 수 있음
// 예외도 객체이기 때문에 객체를 먼저 new로 생성하고 예외를 발생시켜야함
}
