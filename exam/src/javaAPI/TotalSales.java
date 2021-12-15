package javaAPI;

//import java.awt.Menu;
import java.util.ArrayList;

public class TotalSales {
//연습문제-5 하루 총 매출
	public static void main(String[] args) {
		//1.메뉴 객체를 생성하세요 
		Menu m1 = new Menu("김밥", 2000, 57);
		Menu m2 = new Menu("돈까스", 6000, 29);
		Menu m3 = new Menu("냉면", 5000, 34);
		//2.스토어 객체를 만든후 위의 메뉴들을 추가하세요
		Store store = new Store();
		store.add(m1);
		store.add(m2);
		store.add(m3);
		
		//3.하루 총 매출을 계산하세요
		System.out.printf("총 매출: %d원",store.totalSales());
	}
}

class Store {
	private ArrayList<Menu> list;
	
	public Store() {
		this.list = new ArrayList<Menu>();
	}
	
	public void add(Menu menu) {
		list.add(menu);
	}
	
	//총 매출액 계산 메소드를 만드세요
	public int totalSales() {
		int sum = 0;
		for(int i=0; i<list.size();i++) {
			sum += list.get(i).getPrice()*list.get(i).getCount(); //곱하기 주의!
			
		}
		return sum;
	}
}

class Menu {
	private String name;
	private int price;
	private int count;
	
	public Menu(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	//price 게터
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	//count 게터
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

	
}