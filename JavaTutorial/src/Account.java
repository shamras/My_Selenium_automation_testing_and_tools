import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Account {
	
	public Connection getConn() throws SQLException {
		String url = "jdbc:msql://localhost:3306/";
		String user = "abc";
		String password = "code";
		
		Connection conn = null;
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	public void withdraw(int amount) throws SQLException {
		getConn();
		
		
	}
}
