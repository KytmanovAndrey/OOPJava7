package model;

import view.Loggable;

public class LogCalculator implements CalcOperator {
    private CalcOperator calculator;
    private Loggable logger;

    public LogCalculator(CalcOperator calculator, Loggable logger){
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public CalcOperator sum(float arg) {
        float firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора %f. Начало вызова метода sum с параметром %f", firstArg, arg));
        CalcOperator result = calculator.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public CalcOperator multi(float arg) {
        float firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора %f. Начало вызова метода multi с параметром %f", firstArg, arg));
        CalcOperator result = calculator.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public CalcOperator div(float arg) {
        float firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора %f. Начало вызова метода div с параметром %f", firstArg, arg));
        CalcOperator result = calculator.div(arg);
        logger.log(String.format("Вызова метода div произошел"));
        return result;
    }

    @Override
    public float getResult() {
        float result = calculator.getResult();
        logger.log(String.format("Получение результата %f", result));
        return result;
    }
}
