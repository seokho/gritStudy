package Algorithm;

/**
 * Created by odol on 2016. 11. 24..
 */
public class FibonacciFactory implements AlgorithmAbstractFactory {
    private int[] array;
    public FibonacciFactory(int[] array) {
        this.array = array;
    }

    public Algorithm createAltorithm() {
        return new Fibonacci(array);
    }
}
