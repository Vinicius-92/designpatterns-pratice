package behavioral.strategy.person;

import behavioral.strategy.person.strategies.work.WorkStrategy;
import behavioral.strategy.person.strategies.eat.EatStrategy;
import behavioral.strategy.person.strategies.transportation.TransportationStrategy;
import lombok.AllArgsConstructor;

public class Person {
	private final EatStrategy eatStrategy;
	private final TransportationStrategy moveStrategy;
	private final WorkStrategy workStrategy;
	private final String name;

	public Person(String name, EatStrategy eatStrategy, TransportationStrategy moveStrategy, WorkStrategy workStrategy) {
		this.name = name;
		this.eatStrategy = eatStrategy;
		this.moveStrategy = moveStrategy;
		this.workStrategy = workStrategy;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void eat() {
		eatStrategy.eat();
	}
	
	public void move() {
		moveStrategy.move();
	}
	
	public void work() {
		workStrategy.work();
	}
}
