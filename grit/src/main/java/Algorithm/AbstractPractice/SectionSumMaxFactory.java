package Algorithm.AbstractPractice;

/**
 * Created by odol on 2016. 11. 24..
 */
public class SectionSumMaxFactory implements AlgorithmAbstractFactory {
    private int[] array;

    public SectionSumMaxFactory(int[] array) {
        this.array = array;
    }

    public Algorithm createAltorithm() {
        return new SectionSumMax(array);
    }
}
