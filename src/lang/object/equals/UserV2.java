package lang.object.equals;

/**
 * id가 같으면 논리적으로 같은 객체로 정의
 * 즉, 동등성 판단의 기준 -> id
 * Object 클래스가 제공하는 equals() 메서드를 클래스에 맞게 오버라이딩 해야함
 */

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; // 객체의 특정 값을 사용하기 위해선 다운캐스팅을 해야 함
        return id.equals(user.id);
    }
}
