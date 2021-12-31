package buffet;

public class NonMembership {
	private String name;
	private int phone;
	private int date;
	private int numbers;
	private int time;
	public NonMembership(String name, int phone, int date, int numbers, int time) {
		super();
		this.name = name;
		this.phone = phone;
		this.date = date;
		this.numbers = numbers;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
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
	@Override
	public String toString() {
		return "NonMembership [name=" + name + ", phone=" + phone + ", date=" + date + ", numbers=" + numbers
				+ ", time=" + time + "]";
	}
}
