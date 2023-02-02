package com.jsp.controller;

import com.jsp.dao.EmployeeDao;


public class Delete {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDao();

		boolean employee = dao.delete(201);
		
		if(employee==true)
		{
			System.out.println("Data Removed Successfully!!!...");
		}
		else
		{
			System.out.println("Data Not Found!!!...");
		}
	}

}
