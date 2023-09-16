package Dynamic_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_dynamic {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","root");
	PreparedStatement p=c.prepareStatement("delete from tcs where eid=?");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	p.setInt(1, sc.nextInt());
	
	p.execute();
	System.out.println("data is deleted");
}
}
