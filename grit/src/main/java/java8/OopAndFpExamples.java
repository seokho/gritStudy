package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by odol on 2016. 11. 28..
 */
public class OopAndFpExamples {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        String result = numbers.stream().map(String::valueOf).collect(Collectors.joining(" : "));
        CalculatorService calculatorService = new CalculatorService(new Addtion());
        calculatorService.calculate(1,1);

        FpCalculatorService fpCalculatorService = new FpCalculatorService();
        int addtionFp = fpCalculatorService.calculate(new Addtion(), 1,2);
        //anonymous function
        System.out.println(fpCalculatorService.calculate((i1, i2) -> i1 + i2, 1, 1));
        // 변하는 부분을 쉽게쉽게 변경시켜서 사용할 수 있다
        System.out.println(fpCalculatorService.calculate((i1, i2) -> (i1 + i2) * (i2), 1, 1));
        Calculation addtion = (i1, i2) -> i1 + i2;

        //oop 에선 dependency 를 만들어서 주입하고 하는 방식인데 functional에선 위와 같이 활용 가능

    }


}

interface Calculation {
    int calculate(int num1, int num2);
}

class Addtion implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}

class Subtraction implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}

class Multiplication implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
}

class Division implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 / num2;
    }
}

class CalculatorService {
    Calculation calculation;

    public CalculatorService(Calculation calculation) {
        this.calculation = calculation;
    }

    public int calculate(int num1, int num2) {
        return calculation.calculate(num1, num2);
    }

}

class FpCalculatorService {
    public int calculate(Calculation calculation, int num1, int num2) {
        return calculation.calculate(num1, num2);
    }

}