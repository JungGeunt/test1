package test02.setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseDev {

	private String driver ="com.mysql.cj.jdbc.driver.mysql";
	private String url;
	private String uid;
	private String upw;
	
	public DataBaseDev() {}

	public DataBaseDev(String driver ,String url, String uid, String upw) {
		
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
	}
	}
		public void test() {
			try {
				Connection conn = DriverManager.getConnection(url, uid, upw);
				Statement stmt = conn.createStatement();
				
				String sql ="select * from users";
				
				ResultSet rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					System.out.println("test 성공");
				}else {
					System.out.println("SQL 실패");
				}
				System.out.println(rs.getString("name"));
			} catch (Exception e) {
				
			}
			
		}

		public String getDriver() {
			return driver;
		}

		public void setDriver(String driver) {
			this.driver = driver;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getUid() {
			return uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getUpw() {
			return upw;
		}

		public void setUpw(String upw) {
			this.upw = upw;
		}
		
		
		
}
