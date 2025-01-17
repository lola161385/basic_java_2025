package week_3.w3_8_functionalInterface;

import java.util.function.BinaryOperator;

public class BasicFuncInterfaceSample {
    BinaryOperator<Integer> add = (a, b) -> a + b;
    int result = add.apply(2, 3);
}
