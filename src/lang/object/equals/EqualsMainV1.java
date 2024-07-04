package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id - 100");
        UserV1 user2 = new UserV1("id - 100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));
    }
}

// Object가 기본적으로 제공하는 equals() 메서드
// -> == 연산자를 이용하여 동일성을 비교한다.
// -> 동등성을 비교하기 위해서는 오버라이딩을 해야한다.
// 왜? : 각 클래스마다 다른 기준으로 동등성을 처리하기 때문이다.
