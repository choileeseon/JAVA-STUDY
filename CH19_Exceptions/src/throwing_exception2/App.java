package throwing_exception2;

public class App {

	public static void main(String[] args) throws Exception {
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(32);			
		} catch (Exception e) {
			//온도 예외 발생
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
