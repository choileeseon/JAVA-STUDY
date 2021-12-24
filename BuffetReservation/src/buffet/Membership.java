package buffet;

public class Membership {
	private String id;
	private int password;
	
	public Membership(String id, int password) {
		this.id = id;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Membership [회원번호=" + id + ", 휴대폰 끝 4자리=" + password + "]";
	}
	
	
}
