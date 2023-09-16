package Dynamic_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class insert_dynamic {
public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","root");
	PreparedStatement p=c.prepareStatement("insert into tcs values(?,?,?,?)");
	Scanner sc=new Scanner(System.in);
//	System.err.println("enter id");
//	int id=sc.nextInt();
//	System.out.println("enter ename");
//	String ename=sc.next();
//	System.out.println("enter email");
//	String e_mail=sc.next();
//	System.out.println("enter phone number");
//	long phone_no=sc.nextLong();
//	
//	p.setInt(1, id);
//	p.setString(2, ename);
//	p.setString(3, e_mail);
//	p.setLong(4, phone_no);
	System.out.println("enter id");
	p.setInt(1, sc.nextInt());
	System.out.println("enter ename");
	p.setString(2, sc.next());
	System.out.println("enter email");
	p.setString(3, sc.next());
	System.out.println("enter phone num");
	p.setLong(4, sc.nextLong());
		
	
	p.execute();
	System.out.println("data inserted");
}
}
