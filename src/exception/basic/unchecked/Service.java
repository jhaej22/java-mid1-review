package exception.basic.unchecked;

/**
 * Unchecked 예외는
 * 예외를 잡거나, 던지지 않아도 된다.(메서드 옆에 throws를 넣지 않아도 된다.)
 * 예외를 잡지 않으면 자동으로 밖으로 던진다.
 */

public class Service {
    Client client = new Client();

    /**
     * 필요한 경우에 예외를 잡아서 처리하면 됨
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyuncheckedException e) {
            // 예외 처리 로직
            System.out.println("예외처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /**
     * 예외를 잡지 않으면, 자연스럽게 상위로 넘어감
     * 체크 예외와 다르게 throws 예외 선언을 하지 않아도 됨
     */
    public void callThrow() {
        client.call();
    }

}
