package controller;

import service.ICalcOperatorFactory;
import view.CalculatorView;

public class LogCalculatorController {

    private final ICalcOperatorFactory factory;
    private final CalculatorView view;


    public LogCalculatorController(ICalcOperatorFactory factory, CalculatorView view) {
        this.factory = factory;
        this.view = view;
    }

    public void start() {
        view.run();
    }
}
