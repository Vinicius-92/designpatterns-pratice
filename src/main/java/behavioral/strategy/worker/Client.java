package behavioral.strategy.worker;

import behavioral.strategy.worker.jobs.Developer;
import behavioral.strategy.worker.jobs.HispsterDeveloper;
import behavioral.strategy.worker.jobs.Pilot;
import behavioral.strategy.worker.jobs.Worker;

public class Client {

	public static void presentYourself(Worker worker, String name) {
		System.out.println("Hi, I'm " + name);
		worker.eat();
		worker.move();
		worker.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		var jhon = new Developer();
		presentYourself(jhon, "Jhon");
		
		var ann = new Pilot();
		presentYourself(ann, "Ann");

		var carol = new HispsterDeveloper();
		presentYourself(carol, "carol");
		
		
	}
}
