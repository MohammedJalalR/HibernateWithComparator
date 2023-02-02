package com.jsp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestSave {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList();

		list.add(new Employee(301, "Nat", 76000.00, LocalDate.of(2020, 07, 15)));

		list.add(new Employee(332, "Stark", 86000.00, LocalDate.of(2016, 9, 27)));

		list.add(new Employee(353, "Mark", 56000.00, LocalDate.of(2018, 11, 14)));

		EmployeeDao dao = new EmployeeDao();
		
		dao.Save(list);

	}

}
