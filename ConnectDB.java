package AppQLgiay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection connect() {
		
		Connection con = null;
		
		try{
	  con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QLgiay", "sa","sapassword");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
