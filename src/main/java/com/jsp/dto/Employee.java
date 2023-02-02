package com.jsp.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column(name = "EmployeeId")
	private int id;
	@Column(name = "EmployeeName")
	private String name;
	@Column(name = "EmployeeSalary")
	private double salary;
	@Column(name = "JoiningDate")
	private LocalDate JoiningDate;

	public Employee(int id, String name, double salary, LocalDate joiningDate) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		JoiningDate = joiningDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getJoiningDate() {
		return JoiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		JoiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", JoiningDate=" + JoiningDate + "]";
	}

	public Employee() {
		

	}

}
