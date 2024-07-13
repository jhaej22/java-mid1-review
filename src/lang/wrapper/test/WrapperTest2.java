package lang.wrapper.test;

public class WrapperTest2 {

    public static void main(String[] args) {
        String[] arr = {"1.5", "2.5", "3.0"};
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            double d = Double.parseDouble(arr[i]);
            sum += d;
        }

        System.out.println("sum = " + sum);
    }
}
