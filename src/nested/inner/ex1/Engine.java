package nested.inner.ex1;

public class Engine {

    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("충전 레벨 확인: " + car.getChargeLevel());
        System.out.println(car.getModel() + "의 엔진을 구동합니다.");
    }
}

// Engine 클래스는 Car 클래스에서만 사용됨
// 엔진을 구동하기 위해서 차의 충전레벨과 모델명이 필요함
