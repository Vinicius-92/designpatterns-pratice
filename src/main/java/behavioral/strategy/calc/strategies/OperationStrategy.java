package behavioral.strategy.calc.strategies;

@FunctionalInterface
public interface OperationStrategy {
	int calculate(int num1, int num2);
}
