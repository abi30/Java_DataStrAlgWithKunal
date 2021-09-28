import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/bdemployees_database";
		int rowaffected;
		try {
			Connection conn = DriverManager.getConnection(url, "root", "0751Abi301188@");

//			create a statement  object to send to the database;

			Statement statement = conn.createStatement();
//			execute the Statement 
//			ResultSet resultSet = statement.executeQuery("select * from bdemployees_tbl");

			rowaffected = statement.executeUpdate("update bdemployees_tbl set dept='tvc' where id =1100;");
//			int salaryTotal = 0;
//			while (resultSet.next()) {
//				salaryTotal = salaryTotal + resultSet.getInt("salary");1
//				System.out.println(
//						resultSet.getInt("id") + " " +
//				resultSet.getString("name") + " " + resultSet.getString("salary"));
//			}
			System.out.println("statement is updated and rowaffected : " + rowaffected);

		} catch (SQLException e) {
			System.out.println("it's while duplicate to update ");
		}

	}

}
