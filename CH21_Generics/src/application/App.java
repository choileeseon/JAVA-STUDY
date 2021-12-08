package application;

import collections.Wrapper;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;

public class App {

	public static void main(String[] args) {
		//첫번쨰 <Cat>을 적어줘서 뒤에는 <Cat>안적어도 됨
		Wrapper<Cat> wrap1 = new Wrapper<>();
		Wrapper<Creature> wrap2 = new Wrapper<>();
		Wrapper<Mammal> wrap3 = new Wrapper<>();
		
		Cat cat = new Cat("마틸다");
		Creature cr = new Creature("크리쳐");
		Mammal mam = new Mammal("포유류");
		
		//wrapper.set(Object object);
		wrap1.set(cat); //마틸다
		wrap2.set(cr);
		wrap3.set(mam);

		//값을 가져오는 get에는 변수에 저장한다. 
		Cat c1 = wrap1.get();
		Creature c2 = wrap2.get();
		Mammal m3 = wrap3.get();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(m3);
	}

}
		
		