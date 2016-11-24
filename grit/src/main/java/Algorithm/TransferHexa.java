package Algorithm;

/**
 * Created by odol on 2016. 11. 24..
 */
public class TransferHexa extends Algorithm {
    private int[] array;
    private static final int OCTA_VALUE = 8;
    private static final int HEXA_VALUE = 16;

    public TransferHexa(int[] array) {
        this.array = array;
    }

    private String transferHexa(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        while (num  >= HEXA_VALUE) {
            stringBuilder.append(convertHexa(num % HEXA_VALUE));
            num /= HEXA_VALUE;
        }
        return stringBuilder.append(num).reverse().toString();
    }

    private char convertHexa(int num) {
        if (num < 10) {
            return (char) (num + '0');
        }
        return (char) (num -10 + 'A');
    }


    public String getResult() {
        return transferHexa(array[0]);
    }
}
