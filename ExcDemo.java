import java.sql.*;

class ExcDemo
{
	public static void main(String[] args) throws Exception
	{
		String url ="jdbc:mysql://localhost:3306/bus_ticket_booking_system";
		String un ="root";
		String pwd = "admin";
		//JDBC STEPS
		//1.LOADING THE DRIVER
		//2.ESTABLISHING THE 
		int a=10,b=0;
		int d=a/b;
		int[] arr={1,2,3,4,5};
		try 
		{
			arr[30]=100; 
		}
		catch(ArrayIndexOutOfBoundException )
		{
			System.out.println("Exception")
		}
		System.out.println("Hello");
	}
}