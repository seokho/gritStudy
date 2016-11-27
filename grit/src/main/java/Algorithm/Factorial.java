package Algorithm;

/**
 * Created by odol on 2016. 11. 25..
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }


    private static int factorial(int num) {
        if (num < 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }


}
