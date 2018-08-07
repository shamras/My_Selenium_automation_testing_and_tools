import java.sql.SQLException;

public class ExceptionsDemo {

	public static void main(String[] args) {
		Account acc = new Account ();
		try {
			acc.withdraw(100);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//System.out.println(e.getMessage());
			System.out.println("Try again at some other point");
		}
		finally {
			System.out.println("always execute");
		}
	}
}
