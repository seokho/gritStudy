package Algorithm;

import java.util.Comparator;

/**
 * Created by odol on 2016. 11. 23..
 */
public class Fibonacci extends Algorithm {
    private int[] array;
    private int[] memo;

    public Fibonacci(int[] array) {
        this.array = array;
    }

    private int runFibonacci(int num) {
        memo = new int[num + 1];
        return fibonacci(num);
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

    @Override
    public int getResult() {
        return runFibonacci(array[0]);
    }
}
