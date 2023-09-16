package Crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Drop_col_in_table {
public static void main(String[] args) throws Exception {
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","root");
	Statement s=c.createStatement();
	s.execute("alter table employ drop column emp_sal");
	System.out.println("column droped");
	

}
}
