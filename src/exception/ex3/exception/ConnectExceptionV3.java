package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3 {
    private final String address;

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
// 연결 실패시 발생하는 예외
// 내부에 외부 서버 주소인 address를 보관
