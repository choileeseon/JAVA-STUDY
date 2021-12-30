package buffet;
//예약날짜, 인원수, 예약시간
public class Booked {
	private int date;
	private int numbers;
	private int time;
//	private String passwordBook;

	
	public Booked(int date, int numbers, int time) {
		super();
		this.date = date;
		this.numbers = numbers;
		this.time = time;
		
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public int getPassword() {
//		return password;
//	}
//	public void setPassword(int password) {
//		this.password = password;
//	}
//	
	
	

	
	
	
}
