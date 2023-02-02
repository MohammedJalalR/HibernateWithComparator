package com.jsp.dao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jazz");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public void Save(List<Employee> list) {

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Comparator<Employee> c1 = new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {

				return o1.getId() - o2.getId();
			}
		};

		Collections.sort(list, c1);
		entityTransaction.begin();
		for (Employee e2 : list) {
			entityManager.persist(e2);
		}
		entityTransaction.commit();
	}

	public List<Employee> getAll() {

		Query query = entityManager.createQuery("Select e from Employee e");

		List<Employee> e1 = query.getResultList();

		Comparator<Employee> c1 = new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {

				return o1.getName().compareTo(o2.getName());
			}
		};

		Collections.sort(e1, c1);

		return e1;

	}

	public List<Employee> GetSpecificId() {
		Query query = entityManager.createQuery("Select e from Employee e");

		List<Employee> e1 = query.getResultList();

		Comparator<Employee> c1 = new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {

				return o1.getId() - o2.getId();
			}
		};

		Collections.sort(e1, c1);

		return e1;

	}

	public boolean delete(int id) {

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee employee = entityManager.find(Employee.class, id);

		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
		
		return true;

	}

}
