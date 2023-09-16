package Crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","root");
		Statement s=c.createStatement();
		int x=s.executeUpdate("update employ set emp_sal=1000 where eid=1");
		System.out.println("data is update");
	}
}
