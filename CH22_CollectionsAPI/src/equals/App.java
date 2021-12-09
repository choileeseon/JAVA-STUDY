package equals;

import java.util.Objects;

class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //객체가 같을 경우(당연히 같음)
			return true;
		if (obj == null) //null값이 들어가면 무조건 F 비교할 대상이 없으니까
			return false;
		if (getClass() != obj.getClass()) //클래스 타입이 다를경우 무조건 F
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name); //위의3가지가 아닐경우 이름으로 비교한다
	}
	
}

public class App {

	public static void main(String[] args) {
		// 같은지 비교하는 메소드
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
	}

}
