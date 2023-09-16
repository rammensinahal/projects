package Crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class featch {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","root");
	Statement s=c.createStatement();
	ResultSet r=s.executeQuery("select * from employ  ");
	while(r.next())
	{
	System.out.println(r.getInt(1)+" "+r.getString(2));
	}
	System.err.println("data is featched");
}
}
