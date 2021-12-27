package member;

//빈즈클래스명 : 1.테이블 + Bean => ZipcodeBean
public class ZipcodeBean {
	//빈즈는 테이블에 레코드 단위에 값을 저장하는 객체덩어리, 컬럼단위에 값을 넣고 가져가고 하는 기능
	//2.private 데이터타입 컬럼명
	private String zipcodel;
	private String area1;
	private String area2;
	private String area3;
	
	//3.getter, setter 선언 (getZipcode, setZipcode)
	public String getZipcodel() {
		return zipcodel;
	}
	public void setZipcodel(String zipcodel) {
		this.zipcodel = zipcodel;
	}
	public String getArea1() {
		return area1;
	}
	public void setArea1(String area1) {
		this.area1 = area1;
	}
	public String getArea2() {
		return area2;
	}
	public void setArea2(String area2) {
		this.area2 = area2;
	}
	public String getArea3() {
		return area3;
	}
	public void setArea3(String area3) {
		this.area3 = area3;
	}
	

	
	
	
}
