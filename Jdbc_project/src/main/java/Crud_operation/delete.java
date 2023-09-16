package Crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class delete {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","root");
	Statement s=c.createStatement();
	s.execute("delete from employ where eid=3");
	System.out.println("data is deleted");
}
}
