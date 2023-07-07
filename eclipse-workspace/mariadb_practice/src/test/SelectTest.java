package test;

public class SelectTest {
public static void main(String[] args) {
		
	}
		private static void (String ) {
			
			
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
						"select no, name" + 
				        " from dept"+
						"order by no desc";
				rs=  stmt.executeQuery(sql);
				// 5. 결과 처리
				while (rs.next()) {
				    Long no =rs.getString(1);
				    String name=s.getString(2);
				    
				    (no "+ : +" name)
				}	
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
