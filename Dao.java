package jdbcQuesion12;

import java.sql.*;
import java.util.*;
public class Dao {
	
	
	public void insert(int v,String name,String city) throws SQLException, ClassNotFoundException {
		
		
		Connection c =GetConnection.getConnection();
		
		PreparedStatement stmt;
		
		stmt = c.prepareStatement("insert into student values(?,?,?);");
	
		stmt.setInt(1,v);	
		
		stmt.setString(2,name);
		
		stmt.setString(3, city);
		
		int i = stmt.executeUpdate();
		
		System.out.println(i+"records inserted");
		
		c.close();
		
		
	}
	
	public void read() throws ClassNotFoundException, SQLException {
		
		Connection c = GetConnection.getConnection();
		
		PreparedStatement stmt=c.prepareStatement("select * from student;");
		
		ResultSet r =stmt.executeQuery();
		
		while(r.next()) {
			
			System.out.println(r.getInt(1)+" , "+r.getString(2)+" , "+r.getString(3));
			
		}
		
	}
	
	
	public void update(String name,int v) throws ClassNotFoundException, SQLException {
		
		Connection c =  GetConnection.getConnection();
		
		/*UPDATE table_name
		SET column1 = value1, column2 = value2, ...
				WHERE condition;*/
		PreparedStatement stmt =  c.prepareStatement("Update student Set name=? where name=?;");
		
		stmt.setString(1,name);
		stmt.setInt(2, v);
		
		int i=stmt.executeUpdate();
		
		System.out.println(i+" records updated");
		
	}
	
	public void delete(String name) throws ClassNotFoundException, SQLException {
		
		Connection c = GetConnection.getConnection();
		
		PreparedStatement stmt = c.prepareStatement("delete from student where name=?");
		
		stmt.setString(1, name);
		
		int i=stmt.executeUpdate();
		
		System.out.println(i+" records got deleted");
		
	}
	

}
