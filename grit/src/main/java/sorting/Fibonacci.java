package sorting;

/**
 * Created by odol on 2016. 11. 23..
 */
public class Fibonacci {
    private int[] memo;

    public void runFibonacci(int num) {
        memo = new int[num + 1];
        System.out.println(fibonacci(num));
    }

    private int fibonacci(int num) {
        if (num <= 2) {
            return 1;
        } else if (memo[num] > 0) {
            return memo[num];
        }
        memo[num] = fibonacci(num - 1) + fibonacci(num - 2);
        return memo[num];
    }
}
