package exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 * (RuntimeException은 제외)
 */
public class MycheckedException extends Exception {
    public MycheckedException(String message) {
        super(message);
    }
}

// 예외 클래스를 만들려면 예외를 상속받으면 된다.