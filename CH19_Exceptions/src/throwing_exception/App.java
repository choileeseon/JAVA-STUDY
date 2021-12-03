package throwing_exception;

public class App {

	public static void main(String[] args) throws Exception {
		Thermostat stat = new Thermostat();
		stat.setTemperature(39); //"온도가 비정상 입니다." if절안이라 예외처리
		stat.setTemperature(33); //"온도세팅 : 33.0"
	}

}
