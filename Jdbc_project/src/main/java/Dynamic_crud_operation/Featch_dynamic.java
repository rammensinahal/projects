package Dynamic_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Featch_dynamic {
public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","root");
	PreparedStatement p=c.prepareStatement("select * from tcs where eid=?");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	p.setInt(1, sc.nextInt());
	
	ResultSet r=p.executeQuery();
	while(r.next()) {
		System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getLong(4));
	}
}
}
