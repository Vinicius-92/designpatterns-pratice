package behavioral.strategy.person;

import behavioral.strategy.person.strategies.work.DeveloperStrategy;
import behavioral.strategy.person.strategies.work.NoWorkStrategy;
import behavioral.strategy.person.strategies.work.PilotStrategy;
import behavioral.strategy.person.strategies.eat.MeatFoodStrategy;
import behavioral.strategy.person.strategies.eat.VeggieFoodStrategy;
import behavioral.strategy.person.strategies.transportation.AirplaneStrategy;
import behavioral.strategy.person.strategies.transportation.BikeStrategy;
import behavioral.strategy.person.strategies.transportation.CarStrategy;
import behavioral.strategy.person.strategies.transportation.WalkStrategy;

public class Client {

	public static void presentYourself(Person person) {
		System.out.println("Hi, I'm " + person.getName());
		person.eat();
		person.move();
		person.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Person jhon = new Person("Jhon", new MeatFoodStrategy(), 
				new CarStrategy(), new DeveloperStrategy());
		presentYourself(jhon);
		
		Person ann = new Person("Ann", new MeatFoodStrategy(), 
				new AirplaneStrategy(), new PilotStrategy());
		presentYourself(ann);
		
		Person carol = new Person("Carol", new VeggieFoodStrategy(), 
				new BikeStrategy(), new DeveloperStrategy());
		presentYourself(carol);
		
		Person alan = new Person("Alan", new VeggieFoodStrategy(), 
				new WalkStrategy(), new NoWorkStrategy());
		presentYourself(alan);
	}
}
