package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cust.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Transaction tx = null;
		try{
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			tx = session.beginTransaction();
//			List<String> custAddr = new ArrayList<>();
//			custAddr.add("CHE");
//			custAddr.add("KKR");
//			custAddr.add("RCB");
//			Customer cust = new Customer(4, "abcdddd", "VBf322", custAddr);
//			System.out.println(cust.toString());
//			session.save(cust);
//			tx.commit();
			
			Customer getCust = session.get(Customer.class, 2);
			System.out.println(getCust.toString());
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			//tx.rollback();
		}
	}

}
