package test;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateTest01 {
	public static void main(String[] args) {
		
	}
		private static boolean delete(String ) {
			boolean result = false;
			
			Connection conn=null;
			Statement stmt=null;
		
			try {
				//1. JDBC dRIVER Class 로딩
				Class.forName("org.mariadb.jdbc.Driver");
			   
				// 2. 연결하기
				conn = DriverManager.getConnction();
				String url= "hdbc:mariadb://192.168.0.161:3306/webdb?charset=utf8";
				// 3. statement 
				Statement stmt = conn.createStatement();
				
				//4. sql실행
				String sql=
						"update dept" + 
				        " set name='" + deptName + "'"+
						"where no=" deptNo)";
				int count=  stmt.executeUpdate(sql);
				// 5. 결과 처리
				result =count ==1;		
			}catch (ClassNotFoundException e) {
				System.out.println("드라이버 로딩 안됨:" + e );
				
			}catch {SQLExecption e){
				System.out.println("Error:" + e );
			}finally {
				//6.자원정리
			
				try {
					if (stmt != null) {
						stmt.close();
					if (conn != null) {
						conn.close();
					}
								
				}catch{
					
				}
			}
			return result;	
			
	}
	
}
