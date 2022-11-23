package behavioral.strategy.calc;

import behavioral.strategy.calc.strategies.AdditionOperation;
import behavioral.strategy.calc.strategies.DivisionOperation;
import behavioral.strategy.calc.strategies.MultiplicationOperation;
import behavioral.strategy.calc.strategies.SubtractionOperation;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));

		// Com a adição da annotation de @FuncionalInterface podemos usar lamdbas no lugar
		// de classes específicas implementando a interface
		System.out.println(calc.getResult((n1, n2) -> (int) Math.pow(n1, n2)));
	}
}
