package com.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.Dao.PatientDao;
import com.Dto.Patient;

public class Update 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Patient patient=new Patient();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter name ");
		patient.setName(scanner.nextLine());
		
		System.out.println("Enter Address");
		patient.setAddress(scanner.nextLine());
		
		System.out.println("ENter Phone");
		patient.setPhone(scanner.nextLong());
		
		System.out.println("Enter Doctor");
		scanner.nextLine();
		patient.setDocter(scanner.nextLine());
		
		
		System.out.println("P_id");
		patient.setP_Id(scanner.nextInt());
		
		
		
		PatientDao dao=new PatientDao();
		dao.Update(patient);
		
	}

}

