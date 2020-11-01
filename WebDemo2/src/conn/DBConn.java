package conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn
{
	public static Connection getconn() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oopdemo", "sujit", "1234");
	return conn;
	}

}
