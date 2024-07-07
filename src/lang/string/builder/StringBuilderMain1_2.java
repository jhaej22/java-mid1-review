package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println("str = " + str);
    }
}

// StringBuilder 클래스의 주요 메서드는
// 메서드 체이닝 기법을 활용할 수 있도록
// 메서드를 호출하면 자기 인스턴스의 참조값을 반환함
