package Algorithm.AbstractPractice;

/**
 * Created by odol on 2016. 11. 24..
 */
public class AlgorithmFactory {
    public static Algorithm getAlgorithm(AlgorithmAbstractFactory algorithmAbstractFactory) {
        return algorithmAbstractFactory.createAltorithm();
    }
}
