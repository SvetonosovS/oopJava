package Homework7.Culc;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int firstArg, boolean logFlag) {
        if (logFlag) {
            Calculable calculator =  new Calculator(firstArg);
            return new LoggableCalculator(calculator);
        }
        return new Calculator(firstArg);
    }
}