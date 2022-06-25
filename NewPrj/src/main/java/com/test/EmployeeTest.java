package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Configuration cfg = new  Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpId(3);
		emp.setEmpName("ABCDXYZ");
		emp.setEmpSal(4000);
		emp.getEprjs().add("ABCD");
		emp.getEprjs().add("PQRS");
		
		session.save(emp);
		tx.commit();
		session.close();
	}
}
