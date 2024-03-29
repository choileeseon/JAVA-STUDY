package lambda_return;

interface Joiner{
	String join(String text1, String text2); // 추상메서드에 리턴, 매개변수에 있는경우
}

public class App {
	public static void main(String[] args) {
		//리턴값이 있는 경우
		Joiner joiner = (t1,t2) -> {
			String text = t1 + " - " + t2;
			return text;
		};
		System.out.println(joiner.join("치킨", "맥주"));
		System.out.println(joiner.join("학원", "공부"));

		// 람다식
		//Joiner joiner2 = (s1,s2) -> return s1 + " - " + s2; //코드가 한줄일때 return도 생략가능 
		Joiner joiner2 = (s1,s2) -> s1 + " + " + s2; 
		
		System.out.println(joiner2.join("치킨", "맥주"));
		System.out.println(joiner2.join("학원", "공부"));
	}
}
