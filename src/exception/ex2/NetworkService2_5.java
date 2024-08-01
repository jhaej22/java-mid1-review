package exception.ex2;

public class NetworkService2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data); //  정상 흐름
        } catch (NetworkClientExceptionV2 e) { // 예외 흐름
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally { // 반드시 호출 되는 마무리 흐름
            client.disconnect();
        }
    }
}

// try, catch에서 예외를 잡지 못해도
// 먼저 finally 흐름이 실행된 뒤에 코드 밖(메서드 밖)으로 예외를 던짐
