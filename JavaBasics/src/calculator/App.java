package calculator;

public class App {

    public static int sumNumber(int... num) {
        int sum = 0;
        for(int i=0; i<num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumber(1,3,5,7,9));
        System.out.println(sumNumber(1,3,5));
        System.out.println(sumNumber(1,3,5,7,9,11));
    }
}
