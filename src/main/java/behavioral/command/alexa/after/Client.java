package behavioral.command.alexa.after;

import behavioral.command.alexa.after.lights.XiaomiLight;
import behavioral.command.alexa.after.alexa.Alexa;
import behavioral.command.alexa.after.commands.TurnLightOffCommand;
import behavioral.command.alexa.after.commands.TurnLightOnCommand;
import behavioral.command.alexa.after.lights.PhillipsHueLight;


public class Client {

	public static void configureAlexa(Alexa alexa) {
		PhillipsHueLight livingRoom = new PhillipsHueLight();
		XiaomiLight kitchen = new XiaomiLight();
		
		alexa.addIntegration("Turn on the Living room light", new TurnLightOnCommand(livingRoom), "on", "Living room", "light");
		alexa.addIntegration("Turn off the Living room light", new TurnLightOffCommand(livingRoom), "off", "Living room", "light");
		alexa.addIntegration("Turn on the Kitchen light", new TurnLightOnCommand(kitchen), "on", "Kitchen", "light");
		alexa.addIntegration("Turn off the Kitchen light", new TurnLightOffCommand(kitchen), "off", "Kitchen", "light");
	}
	
	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		configureAlexa(alexa);
		alexa.sendRequest("Turn on the Living room light");
		alexa.sendRequest("Turn off the Kitchen light");
		alexa.sendRequest("Please, could you Turn off the Living room light?");
	}
}
