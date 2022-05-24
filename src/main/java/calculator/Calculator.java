package calculator;

import java.util.stream.Stream;

public class Calculator {
    public static void main(String[] args) {

        //Adding
        IOperation sum = (x, y) -> x+y;

        //Substracting
        IOperation sub = (x, y) -> x-y;

    }


}
