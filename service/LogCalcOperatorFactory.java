package service;

import model.CalcOperator;
import model.Calculator;
import model.LogCalculator;
import view.Loggable;

public class LogCalcOperatorFactory implements ICalcOperatorFactory{
    private Loggable logger;

    public LogCalcOperatorFactory(Loggable logger){
        this.logger = logger;
    }
    @Override
    public CalcOperator create(float arg) {
        return new LogCalculator(new Calculator(arg), logger);
    }
}
