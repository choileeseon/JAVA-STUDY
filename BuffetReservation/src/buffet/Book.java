package buffet;

public class Book {
	private int date;
	private int numbers;
	private int time;
//	private String id;
//	private int password;
	
	public Book(int date, int numbers, int time) {
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
