package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    } // 열거형은 생성자에 접근제어자를 선언하지 못하도록 함 (private로 설정되어있음)

    public int getDiscountPercent() {
        return discountPercent;
    }
}
