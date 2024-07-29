package nested.nested.ex1;

public class NetworkMain {

    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello java");
    }
}

// NetworkMain은 Network 클래스만 사용
// NetworkMessage 클래스는 오로지 Network 클래스에서만 사용됨
