package service;

import model.CalcOperator;
import model.Calculator;

public class CalcOperatorFactory implements ICalcOperatorFactory {
    public CalcOperator create(float arg) {
        return new Calculator(arg);
    }
}
