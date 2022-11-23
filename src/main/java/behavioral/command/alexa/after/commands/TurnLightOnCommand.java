package behavioral.command.alexa.after.commands;

import behavioral.command.alexa.after.lights.GenericLight;

public class TurnLightOnCommand implements Command {
	private final GenericLight light;
	public TurnLightOnCommand(GenericLight light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.turnOn();
	}
}
