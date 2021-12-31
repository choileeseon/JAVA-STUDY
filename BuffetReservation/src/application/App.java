package application;

import buffet.Reservation;

public class App {
	public static void main(String[] args) {
		Reservation reserve = new Reservation();
		reserve.setTitle("페닌슐라");
		reserve.reserveBtn(); //1.예약하기 , 2.예약조회하기 목록
		reserve.run();
	}

}
