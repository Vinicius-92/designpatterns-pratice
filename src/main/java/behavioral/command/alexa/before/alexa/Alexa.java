package behavioral.command.alexa.before.alexa;

import java.util.HashMap;
import java.util.Map;

import behavioral.command.alexa.before.lights.PhillipsHueLight;
import behavioral.command.alexa.before.lights.XiaomiLight;

public class Alexa {
	private final Map<String, Object> integrations;
	
	public Alexa() {
		integrations = new HashMap<String, Object>();
		integrations.put("LivingRoomLight", new PhillipsHueLight());
		integrations.put("KitchenLight", new XiaomiLight());
	}

	public void sendRequest(String request) {
		switch (request) {
			case "Turn on the Living room light": {
				System.out.println("Turning on the Living room light");
				PhillipsHueLight light = (PhillipsHueLight) integrations.get("LivingRoomLight");
				light.turnOn();
				break;
			}
			case "Turn off the Living room light": {
				System.out.println("Turning off the Living room light");
				PhillipsHueLight light = (PhillipsHueLight) integrations.get("LivingRoomLight");
				light.turnOff();
				break;
			}
			case "Turn on the Kitchen light": {
				System.out.println("Turning on the Kitchen light");
				XiaomiLight light = (XiaomiLight) integrations.get("KitchenLight");
				light.turnOn();
				break;
			}
			case "Turn off the Kitchen light": {
				System.out.println("Turning off the Kitchen light");
				XiaomiLight light = (XiaomiLight) integrations.get("KitchenLight");
				light.turnOff();
				break;
			}
			default:
				System.out.println("Sorry, I can't perform your request!");
				break;
		}
			 
	}
}
