package com.nit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nit.model.Employee;
import com.nit.util.HibernateUtil;

public class SaveDataTest {

	public static void main(String[] args) {
		SessionFactory factory=null;
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=session.beginTransaction();
			Employee emp1=new Employee();
			emp1.setEmployeeName("Joe");
			emp1.setEmployeeEmail("joe123@gmail.com");
			emp1.setEmployeeSal(4000.4);
			
			Employee emp2=new Employee();
			emp2.setEmployeeName("Rakesh");
			emp2.setEmployeeEmail("rakesh456@gmail.com");
			emp2.setEmployeeSal(4787.5);
			
			Employee emp3=new Employee();
			emp3.setEmployeeName("Raj");
			emp3.setEmployeeEmail("raj232@gmail.com");
			emp3.setEmployeeSal(5000.1);
			session.save(emp1);
			session.save(emp2);
			session.save(emp3);
			tx.commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
