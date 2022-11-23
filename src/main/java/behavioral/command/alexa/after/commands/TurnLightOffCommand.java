package behavioral.command.alexa.after.commands;

import behavioral.command.alexa.after.lights.GenericLight;

public class TurnLightOffCommand implements Command {
	private final GenericLight light;
	public TurnLightOffCommand(GenericLight light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.turnOff();
	}
}
