package application;

import buffet.Reservation;

public class App {
	public static void main(String[] args) {
		Reservation reserve = new Reservation();
		reserve.setTitle("페닌슐라");
		reserve.reserveBtn(); //예약,조회 선택
		reserve.run();
		
		
	}

}
