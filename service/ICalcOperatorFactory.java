package service;

import model.CalcOperator;

public interface ICalcOperatorFactory {
    CalcOperator create(float arg);
}
