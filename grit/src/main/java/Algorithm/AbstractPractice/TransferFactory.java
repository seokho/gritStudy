package Algorithm.AbstractPractice;

/**
 * Created by odol on 2016. 11. 24..
 */
public class TransferFactory implements AlgorithmAbstractFactory {
    private int[] array;
    public TransferFactory(int[] array) {
        this.array = array;
    }

    public Algorithm createAltorithm() {
        return new TransferHexa(array);
    }
}
