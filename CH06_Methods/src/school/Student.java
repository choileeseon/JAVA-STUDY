package school;

public class Student {
	private String name;
	private int age;
	private boolean isVisible; // 집체 true, 원격 false
	private double temperature;
	
	//생성자
	public Student(String name, int age) {
		isVisible = true;
		temperature = 0.0;
		this.name = name;
		this.age = age;
	}
	

	// toString 메소드
	@Override
	public String toString() {
		return "학생 [이름=" + name + ", 나이=" + age + ", 집체=" + isVisible + ", 온도=" + temperature
					+ "]";
	}
	
	// 자동완성기능으로 getter setter 메서드 완성
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getIsVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	

	
	
}
