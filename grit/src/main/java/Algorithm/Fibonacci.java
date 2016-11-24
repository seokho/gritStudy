package Algorithm;

import java.util.Comparator;

/**
 * Created by odol on 2016. 11. 23..
 */
public class Fibonacci extends Algorithm {
    private int[] array;
    private int[] memo;
    private int n, n1, n2;

    public Fibonacci(int[] array) {
        this.array = array;
    }

    private int runFibonacci(int num) {
//        memo = new int[num + 1];
//        return fibonacci(num);
        return improveFibonacci(num);
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

    private int improveFibonacci(int num) {
        n = 0;
        n1 = 1;
        n2 = 1;
        for (int i = 1; i <= num; i++) {
            if (i <= 2) {
                n = 1;
            } else {
                n = n1 + n2;
                n2 = n1;
                n1 = n;
            }

        }
        return n;
    }


    @Override
    public String getResult() {
        return String.valueOf(runFibonacci(array[0]));
    }
}
