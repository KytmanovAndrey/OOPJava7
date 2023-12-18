import controller.LogCalculatorController;
import service.LogCalcOperatorFactory;
import view.CalculatorView;
import view.ConsoleLogger;

public class Main {
    public static void main(String[] args) {
        LogCalcOperatorFactory factory = new LogCalcOperatorFactory(new ConsoleLogger());
        LogCalculatorController controller = new LogCalculatorController(factory, new CalculatorView(factory));
        controller.start();
    }
}
