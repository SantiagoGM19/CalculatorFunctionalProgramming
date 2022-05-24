package calculator;

import java.util.stream.Stream;

public class Calculator {
    public static void main(String[] args) {

        //Adding
        IOperation sum = (x, y) -> x+y;

        //Substracting
        IOperation sub = (x, y) -> x-y;

        //Multiplying
        IOperation mul = (x, y) -> multiply(x, y, sum);

    }

    public static Integer multiply(Integer x, Integer y, IOperation sum){
        return y==0 ? 0 : sum.operate(x,0) + multiply(x, y-1, sum);

    }


}
