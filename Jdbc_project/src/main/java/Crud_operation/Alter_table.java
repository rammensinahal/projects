package Crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Alter_table {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","root");
	Statement s=c.createStatement();
	s.execute("alter table employ add emp_sal integer ");
	System.out.println("table altered");
}
}
