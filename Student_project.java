package Dynamic_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_project {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","root");
		boolean flog=true;
		while(flog) {
			System.out.println("insert students");
			System.out.println("update students");
			System.out.println("featch students");
			System.out.println("delete students");

			Scanner sc=new Scanner(System.in);
			switch (sc.nextInt()) {
			case 1:{

				PreparedStatement p=c.prepareStatement("insert into students value(?,?,?,?)");
				System.out.println("enter sid");
				p.setInt(1,sc.nextInt());
				System.out.println("enter name");
				p.setString(2, sc.next());
				System.out.println("enter gender");
				p.setString(3, sc.next());
				System.out.println("enter phone no");
				p.setLong(4, sc.nextLong());

				p.execute();
				System.out.println("data inserted");
			}

			break;
			case 2:{
				PreparedStatement p=c.prepareStatement("update students set sname=? where sid=?");
				System.out.println("enter sid");
				p.setInt(2,sc.nextInt());
				System.out.println("enter new name");
				p.setString(1, sc.next());
				int x=p.executeUpdate();
				System.out.println("data updated");
			}
			break;
			case 3:{
				PreparedStatement p=c.prepareStatement("select * from students");
				ResultSet r=p.executeQuery();
				while(r.next()) {
					System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getLong(4));
				}
			}
			break;
			case 4:{
				PreparedStatement p=c.prepareStatement("delete from students where sid=?");
				System.out.println("enter id");
				p.setInt(1, sc.nextInt());
				
				p.execute();
				System.out.println("data is deleted");
				
			}

			default:
			{
				System.out.println("invalid option");
			}
				break;
			}
		}

	}
}

