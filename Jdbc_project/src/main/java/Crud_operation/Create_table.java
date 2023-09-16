package Crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_table {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","root");
		Statement s=c.createStatement();
		s.execute("create table tcs(eid integer primary key,ename varchar(20) not null,e_mail varchar(20) not null,phone_no bigint unique)");
		System.out.println("table is created");
	}
}
