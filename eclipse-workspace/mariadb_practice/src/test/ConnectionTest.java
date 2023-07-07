package test;

public class ConnectionTest {
	public static void main (String[] args) {
		try {
			//1. JDBC dRIVER Class 로딩
			Class.forName("org.mariadb.jdbc.Driver");
		   
			// 2. 연결하기
			Connection conn = DriverManager.getConnction();
			String url= "hdbc:mariadb://192.168.0.161:3306/webdb?charset=utf8";"
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 안됨:" +e );
			
		}catch {SQLExecption e){
			System.out.println("Error:" +e );
		}finally {
			try {
				
			}catch{
				
			}finally {
				
			}
		}
		
}
