package enumeration.ex2;

/**
 * ClassGrade 타입을 사용하여 열거한 상수들만 사용
 */
public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(classGrade + ": 할인 x");
        }

        return price * discountPercent / 100; // 할인되는 금액을 반환
    }
}

// discount()메서드
// 매개변수로 ClassGrade 클래스를 사용
// 매개변수에 넘어오는 인수도 ClassGrade가 가진 상수 중에 하나를 사용
// 서로의 참조값 비교인 == 비교를 하면 됨
