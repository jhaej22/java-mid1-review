package enumeration.ref3;

public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 할인금액: " + grade.discount(price));
    }
}

// grade.name() : ENUM의 상수 이름을 사용할 수 있음
// Grade.values(): 열거형의 모든 상수로 이루어진 배열을 반환