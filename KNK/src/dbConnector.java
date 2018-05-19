import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class dbConnector {

	Connection con=null;
	public static Connection dbConnection() {
		String url="jdbc:mysql://localhost:3306/knk_project";
		String user="root";
		String password="";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			Connection con=DriverManager.getConnection(url,user,password);
			
			
			if(!con.isClosed())
			{
				System.out.println("Successfully connected to MYSQL server...");
			}
			
			return con;
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,e);
			return null;
		}

	}

}
