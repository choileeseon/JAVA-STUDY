package exception_example;

import runtime_exception.Thermostat;

public class App {
	public static void main(String[] args) throws InterruptedException {
		Thermostat stat = new Thermostat();
		
		stat.setTemperature(36);
	}

}
