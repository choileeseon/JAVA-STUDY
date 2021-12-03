package custom_exception;

//custom_exception 안에 있는 .exceptions
import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException;

public class App {

	public static void main(String[] args){
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(36);			
		} catch (TempTooHighException e) {
			//온도높을때
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			//온도낮을때
			System.out.println(e.getMessage());
		}

	}

}
