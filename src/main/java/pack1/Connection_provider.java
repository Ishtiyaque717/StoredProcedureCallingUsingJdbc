package pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_provider {
	private static Connection connection;
	public static Connection getConnection() {
		try {
			if(connection==null) {
				connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return connection;
				
	}

}
