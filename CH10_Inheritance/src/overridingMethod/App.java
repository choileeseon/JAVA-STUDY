package overridingMethod;

public class App {

	public static void main(String[] args) {
		// 오버라이딩 메소드
		Cat cat1 = new Cat();
		cat1.vocal();
		
		HouseCat cat2 = new HouseCat();
		cat2.vocal();
		cat2.hunt();
		
		RoadCat cat3 = new RoadCat();
		cat3.vocal();
		cat3.hunt();
		
		Tiger tiger = new Tiger();
		tiger.vocal();
	}

}
