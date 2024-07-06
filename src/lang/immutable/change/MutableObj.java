package lang.immutable.change;

/**
 * 가변 객체에서 add()를 구현하는 방법
 */

public class MutableObj {
    private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public void add(int addValue) {
        value += addValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
