package pack1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class App {

	public static void callProcedure() throws SQLException {
		Connection connection= Connection_provider.getConnection();
		CallableStatement cs=(CallableStatement) connection.prepareCall("call Employee()");
		ResultSet rs=  cs.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("firstName"));
		}
	}
	public static void main(String[] args) throws SQLException {
		callProcedure();
	}
	
}
