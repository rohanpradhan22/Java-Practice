package com.Dao;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Dto.Patient;

public class PatientDao 
{
	static String url="jdbc:mysql://localhost:3306/homepractice";
	static String un="root";
	static String pss="Rohan@22";
	
	public void Insert(Patient p) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(url, un, pss);
		
		PreparedStatement preparedStatement=connection.prepareStatement("insert into hms values(?,?,?,?,?)");
		
		preparedStatement.setInt(1, p.getP_Id());
		preparedStatement.setString(2, p.getName());
		preparedStatement.setString(3, p.getAddress());
		preparedStatement.setLong(4, p.getPhone());
		preparedStatement.setString(5, p.getDocter());
		
		boolean x= preparedStatement.execute();
		
		System.out.println(x);
		
		preparedStatement.close();
		connection.close();
			
	}
	public void Update(Patient p) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(url, un, pss);
		
		PreparedStatement preparedStatement=connection.prepareStatement("Update hms set Name=?,Address=?,Phone=?,Doctor=? where P_id=? ");
		
		preparedStatement.setString(1, p.getName());
		preparedStatement.setString(2, p.getAddress());
		preparedStatement.setLong(3, p.getPhone());
		preparedStatement.setString(4, p.getDocter());
		preparedStatement.setInt(5, p.getP_Id());
		
		int x=preparedStatement.executeUpdate();
		
		System.out.println(x);
		
		preparedStatement.close();
		connection.close();
		
	}

	
	
	
}
