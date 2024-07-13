package lang.wrapper;

public class MyInteger {

    private final int value; // 불변 클래스로 설계함
    // 기본형 변수를 편리하게 사용하도록 다양한 메서드 제공

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    } // compareTo()메서드를 클래스 내부로 캡슐화함
    // 자신의 값과 외부의 값을 비교함

    @Override
    public String toString() {
        return String.valueOf(value); // 숫자를 문자로 변경하는 메서드
    }
}
