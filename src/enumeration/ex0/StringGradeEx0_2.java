package enumeration.ex0;

/**
 * 단순히 문자열을 입력하는 방식의 문제점
 * 1. 타입 안정성 부족: 문자열은 오타 발생이 쉽고, 유효하지 않는 값이 입력될 수 있음
 * 2. 데이터 일관성: 다양한 형식으로 문자열을 입력할 수 있어 일관성이 떨어짐
 */

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급인 경우
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타인 경우
        int diamond = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamond);

        // 소문자인 경우
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);
    }
}

// 회원 등급을 표현할 때 String 사용 시 타입 안정성 부족 문제
// 1. 값의 제한 부족: 잘못된 문자열을 실수로 입력할 가능성이 있음
// 2. 컴파일 시 오류 감지 불가: 이러한 가능성은 컴파일시 감지되지 않고 런타임에서만 문제가 발견됨
// 즉, 회원 등급인 BASIC, GOLD, DIAMOND라는 정확한 문자만 discount에 전달되어야함
// String은 어떤 문자열이든 받을 수 있기 때문에 자바 문법 관점에서는 아무런 문제가 없음
