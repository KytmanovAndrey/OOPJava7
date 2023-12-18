package model;

public interface CalcOperator {
    CalcOperator sum(float arg);
    CalcOperator multi(float arg);
    CalcOperator div(float arg);
    float getResult();
}
