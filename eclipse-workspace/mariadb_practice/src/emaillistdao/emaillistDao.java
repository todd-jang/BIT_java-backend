package emaillistdao;

import test.Connection;
import test.ResultSet;
import test.SQLException;
import test.preparedStatement;

public class emaillistDao {
	Connection conn = null;
	preparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		//1. JDBC Driver Class 로딩
		Class.forName("org.mariadb.jdbc.Driver");
		
		//2. 연결하기
		String url = "jdbc:mariadb://192.168.0.161:3306/emaillist?charset=utf8";
		conn = DriverManager.getConnection(url, "webdb", "webdb");
		
		//3. Statement 생성
		stmt = conn.createStatement();
		conn.prepareStatement(sql);
		
		
		
		//4. SQL 실행
		String sql = (
				"insert into emaillist" + 
				" values(null, '둘', '리', 'dooley@gmail.com')";
		
		rs = stmt.executeQuery(sql);
		
		//5. 결과 처리
		while(rs.next()) {
			Long no = rs.getLong(1);
			String name = rs.getString(2);
			
			System.out.println(no + ":" + name);
		}
		
	} catch (ClassNotFoundException e) {
		System.out.println("드라이버 로딩 실패:" + e);
	} catch (SQLException e) {
		System.out.println("Error:" + e);
	} finally {
		//6. 자원 정리
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
