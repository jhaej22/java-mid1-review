package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));

    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
    // 결과를 int로 반환
    // int와 같은 기본형은 항상 값이 있어야 함
    // 값을 반환할 때 값을 찾지 못하면 숫자 중에 하나(보통 -1, 0)를 사용함
}

// 출력값을 보면 -1일때와 100일 때 모두 -1을 출력함
// 배열에 있는 값이어서 -1을 출력한 것인지
// 배열에 있는 값이 아니기 때문에 못찾아서 -1을 출력한 것인지 명확히 알기 어려움