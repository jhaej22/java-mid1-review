package lang.immutable.address;

/**
 * 주소를 보관하는 객체
 */

public class Address {

    private String value;

    public Address(String value) {
        this.value = value; // 생성자
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
