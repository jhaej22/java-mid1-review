package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 포맷팅: 날짜를 문자로
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String fomattedDate = date.format(formatter);
        System.out.println(fomattedDate);

        // 파싱: 문자를 날짜로
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println(input);
        System.out.println(parsedDate);
    }
}

// 포맷팅: 날짜와 시간 데이터를 원하는 포맷의 문자열로 변경하는 것
// 파싱: 문자열을 날짜와 시간 데이터로 변경하는 것
