package constructorsParameter;

public class Person {
	private String name;
	private double height;
	
	// public Person(){}  // 기본생성자
	// 생성자 메소드 : public + 클래스명(), 리턴타입없음
	public Person() {		// 밑에 있는 name, height를 안적어주면 초기값 설정해둔걸로 값이 됨
		name = "익명";
		height = 170;
		System.out.println("한 사람을 생성!");
	}
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("한 사람을 생성!");
	}
	
	// toString 메소드
	public String toString() {
//		String text = "이름 : "+name+ ", 키 : "+height; 
//		return text;
		// 또는
		return "이름 : "+name+ ", 키 : "+height;
	}
	
	
	// get set 메소드
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	
//	public double getHeight() {
//		return height;
//	}
//	public void setHeight(double height) {
//		this.height = height;
//	}
}
