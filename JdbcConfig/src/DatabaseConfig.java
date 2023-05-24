import java.sql.*;
public class DatabaseConfig {
	public static void main(String[] args) {
		try {
			class.forName("com.mySQL.cj.jdbc.Driver");
			System.out.println("Driver found Successfully.....");
		} catch (classNotFoundException e) {
			System.out.println("Unable to find the Driver class..");
		}
	}

}
