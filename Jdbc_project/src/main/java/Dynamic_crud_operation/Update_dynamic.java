package Dynamic_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_dynamic {
	public static void main(String[] args) throws ClassNotFoundException, Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","root");
		PreparedStatement p=c.prepareStatement("update tcs set ename=? where eid=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		p.setInt(2, sc.nextInt());
		System.out.println("enter new name");
		p.setString(1, sc.next());

		int x=p.executeUpdate();
		System.out.println("data updated");

	}
}
