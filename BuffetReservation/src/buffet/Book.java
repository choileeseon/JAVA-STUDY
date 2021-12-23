package buffet;

public class Book {
	private int date;
	private int numbers;
	private int time;
	private String id;
	
	
	public Book(int date, int numbers, int time, String id) {
		super();
		this.date = date;
		this.numbers = numbers;
		this.time = time;
		this.id = id;
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

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	
	
	
}
