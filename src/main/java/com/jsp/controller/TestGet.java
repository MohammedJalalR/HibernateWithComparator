package com.jsp.controller;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestGet {
	
	public static void main(String[] args) {
		
		
		EmployeeDao dao=new EmployeeDao();
		
		List<Employee> list=dao.GetSpecificId();
		
		for(Employee e:list)
		{
			if(e.getId()>300)
			{
				System.out.println("*************************************************");
				System.out.println("Employee Id is "+e.getId());
				System.out.println("Employee Name is "+e.getName());
				System.out.println("Employee Salary is "+e.getSalary());
				System.out.println("Employee Joining Date is "+e.getJoiningDate());
				System.out.println("*************************************************");
			}
		}
		
		
	}

}
