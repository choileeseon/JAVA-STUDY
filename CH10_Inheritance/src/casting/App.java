package casting;

public class App {

	public static void main(String[] args) {
		// 캐스팅 실습
		Cat cat1 = new HouseCat();	//객체는 하우스캣
		cat1.vocal(); // 하우스캣의 객체이기 때문에 야옹(Cat)이 아닌 미야우로 운다
		cat1.hunt();
		// cat1.call();  //cat1은 Cat타입이기 때문에 Cat 클래스에 없는 메소드 사용불가, 오버라이딩 됨
	
		// 다운 캐스팅
		HouseCat cat2 = (HouseCat)cat1;	//cat2에게 다시 다운 // 컴파일러가 에러표시를 해주지 않아서 실시간 에러 발생
		cat2.call();
	}

}
