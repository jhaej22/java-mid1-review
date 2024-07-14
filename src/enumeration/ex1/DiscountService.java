package enumeration.ex1;

/**
 * String 문자열 대신 상수를 이용하여 해결
 * 하지만 여전히 개발자가 문자열 상수를 사용하지 않고 문자열을 직접 대입하면 막을 수 있는 방법 없음
 */

public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인 x");
        }

        return price * discountPercent / 100; // 할인되는 금액을 반환
    }
}
