package model;

public class Calculator implements CalcOperator {
    private float arg;

    public Calculator(float arg) {
        this.arg = arg;
    }

    @Override
    public CalcOperator sum(float arg) {
        this.arg += arg;
        return this;
    }

    @Override
    public CalcOperator multi(float arg) {
        this.arg *= arg;
        return this;
    }

    @Override
    public CalcOperator div(float arg) {
        this.arg /= arg;
        return this;
    }

    @Override
    public float getResult() {
        return arg;
    }
}
