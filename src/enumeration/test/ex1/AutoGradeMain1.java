package enumeration.test.ex1;

public class AutoGradeMain1 {
    public static void main(String[] args) {
        AutoGrade[] values = AutoGrade.values();
        for (AutoGrade value : values) {
            System.out.println("grade=" + value.name() + ", level=" + value.getLevel() + ", 설명=" + value.getDescription());
        }
    }
}
