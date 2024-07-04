package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        // obj.sound();  -> 컴파일 오류, Object에는 sound()가 없음
        // obj.move(); -> 컴파일 오류, Object에는 move()가 없음

        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}

// Object를 활용한 다형성의 한계
// Object를 통해 전달 받은 객체를 호출하려면 -> 각 객체에 맞는 다운 캐스팅이 필요
