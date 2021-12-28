package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberMer {
	
	private DBConnectionMgr pool;
	
	public MemberMer() {
		try {
			pool = DBConnectionMgr.getInstance();
//			Connection con = pool.getConnection();
			//System.out.println("성공");
		}catch (Exception e) {
			System.out.println("실패");
			e.printStackTrace();
		}
	}//MemberMgr
	
	
	// 우편번호 검색, 제너릭 : Vector에서 저장하는 타입의 지정
	public Vector<ZipcodeBean> zipcodeRead(String area3){
		//DB연동에 필요한 변수선언
		//DB연동은 공식이 있다.
		//java.sql 패키지 클래스
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<>();
		try {
			//DB 연결 객체 
			//DBConnectionMgr 생성 -> Connectio 만들어짐.
			//필요한곳에 빌려주고 반납받는 기법 : 풀링기법
			con = pool.getConnection(); //빌려옴(pool 기법)
			sql = "SELECT * FROM tblZipcode WHERE AREA3 LIKE ?"; //LIKE '%강남대로%'
			//sql문을 매개변수로 pstmt 객체를 리턴
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+area3+"%"); //1이 sql문에 ? 순서를 뜻함.
			rs = pstmt.executeQuery(); //실제 sql문 실행
			while(rs.next()) {
				String str = rs.getString(1) +"\t";
				str+=rs.getString(2) +"\t";
				str+=rs.getString(3) +"\t";
				str+=rs.getString(4);
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con,pstmt,rs);
		}
		return vlist;
	}
	
	
	public static void main(String[] args) {
		MemberMer mgr = new MemberMer();
		mgr.zipcodeRead("강남대로");
	}
}



//jar : SUN에 만든 압축파일 형태
//(class 파일을 압축파일)

/*
* properties - library - 밑에 주소로 - apply
* C:\Program Files (x86)\MySQL\Connector J 8.0 
* */
