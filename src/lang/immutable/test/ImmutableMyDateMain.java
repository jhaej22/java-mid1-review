package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1 = date1.withYear(2025);
        // 불변 객체이므로 인스턴스의 값을 바꾸려면 새로운 객체를 생성해야함
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
