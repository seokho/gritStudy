package Algorithm;

import java.util.Arrays;

/**
 * Created by odol on 2016. 11. 23..
 */
public class AlgorithmRunner {
    public static void main(String[] args) {
        Algorithm fibonacci = AlgorithmFactory.getAlgorithm(new FibonacciFactory(new int[]{10}));
        System.out.println(fibonacci.getResult());
    }
}
