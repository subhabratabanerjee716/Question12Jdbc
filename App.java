package jdbcQuesion12;

import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("Application to perform crud operations");
		
		Dao d = new Dao();
		
		//d.insert(12231,"Tendu","Bangalore");
		
		//d.insert(007,"Ronaldo","Manchester");
		
		//d.read();
		
		//d.update("Pankaj", 4);
		
		d.delete("Ronaldo");
		d.read();

	}

}
