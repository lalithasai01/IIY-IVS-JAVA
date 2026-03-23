import java.sql.*;

class JDBCDemo
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/bus_ticket_booking_system";
		String un = "root";
		String pwd = "admin";

		//JDBC Steps
		//1. Loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		//2. Establishing the Connection
		Connection con = DriverManager.getConnection(url, un, pwd);

		String query = "insert into user_table values(3, 'lalitha','lalli2007','7032178129' )";
		//3. Executing the statement
		Statement st = 	con.createStatement();	
		int res = st.executeUpdate(query);

		//4. Getting the results
		if(res == 1)
			System.out.println("1 row inserted successfully");
		else
			System.out.println("Insertion failed");

		//5. Close the connection
		con.close();
	}
}