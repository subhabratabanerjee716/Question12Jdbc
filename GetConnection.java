package jdbcQuesion12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","1234");
		
		
		return con;
		
	}
	

}
