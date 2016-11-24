package Algorithm;

/**
 * Created by odol on 2016. 11. 24..
 */
public class SectionSumMax extends Algorithm {
    private int[] array;
    private int sum;
    private int result;
    public SectionSumMax(int[] array) {
        this.array = array;
        sum = 0;
        result = Integer.MIN_VALUE;
    }

    private int sectionSumMax() {
        for(int num : array) {
            sum = Math.max(sum, 0) + num;
            result = Math.max(result,sum);
        }
        return result;
    }

    public String getResult() {
        return String.valueOf(sectionSumMax());
    }
}
