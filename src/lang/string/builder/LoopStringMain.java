package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = " ";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java";
            // result = new StringBuilder().append(result).append("Hello Java).toString();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}

// 반복문 내부에서 최적화 되는 것처럼 보이지만
// 사실 반복문의 반복 횟수만큼 객체를 생성해야 함

// 1. 문자열 리터럴 최적화
// : 자바 컴파일러가 컴파일 단계에서 문자열 리터럴을 자동으로 더해줌
// 따로 런타임에 문자열 결합 연산을 수행하지 않아도 됨

// 2. String 변수 최적화
// : 문자열 변수의 경우 그 안에 어떤 값이 들어있는지 컴파일 시점에 알 수 없음