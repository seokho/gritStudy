package java8;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by odol on 2016. 11. 28..
 */
public class CalculatorServiceTest {
    @Test
    public void calculate() throws Exception {
        Calculation calculation = new Addtion();
        int actual = calculation.calculate(1,1);

        Assert.assertEquals(2,actual);
    }

}