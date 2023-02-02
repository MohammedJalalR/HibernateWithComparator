package com.jsp.controller;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestGetAll {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDao();

		List<Employee> e1 = dao.getAll();

		for (Employee e2 : e1) 
		{

			System.out.println("**************************************************");
			System.out.println("Employee Id is " + e2.getId());
			System.out.println("Employee Name is " + e2.getName());
			System.out.println("Employee Salary is " + e2.getSalary());
			System.out.println("Employee Joining Date is " + e2.getJoiningDate());
			System.out.println("**************************************************");
		}

	}

}
