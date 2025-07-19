package com.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.Dao.PatientDao;
import com.Dto.Patient;

public class Insert 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Patient patient=new Patient();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter P_Id ");
		patient.setP_Id(scanner.nextInt());
		
		System.out.println("Enter Name ");
		scanner.nextLine();
		patient.setName(scanner.nextLine());
		
		System.out.println("Enter Address ");
		patient.setAddress(scanner.nextLine());
		
		System.out.println("Enter Phone NO. ");
		patient.setPhone(scanner.nextLong());
		scanner.nextLine();
		
		System.out.println("Enter Doctor ");
		patient.setDocter(scanner.nextLine());
		
		PatientDao dao=new PatientDao();
		dao.Insert(patient);
		
		
	}

}
