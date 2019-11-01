package com.nit.client;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.nit.model.Employee;
import com.nit.util.HibernateUtil;

public class CriteriaQueryPartialEntitesTest {

	public static void main(String[] args) {
		SessionFactory factory=null;
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=session.beginTransaction();
			CriteriaBuilder builder=session.getCriteriaBuilder();
			CriteriaQuery<Object[]> criteriaQuery=builder.createQuery(Object[].class);
			Root<Employee> root=criteriaQuery.from(Employee.class);
			
			Path<Object> enamePath=root.get("employeeName");
			Path<Object> emailPath=root.get("employeeEmail");
			Path<Object> esalPath=root.get("employeeSal");
			criteriaQuery.select(builder.array(enamePath,emailPath,esalPath));
			
			
			Query<Object[]> query=session.createQuery(criteriaQuery);
			List<Object[]> list=query.list();
			for(Object[] ob:list) {
				System.out.println("Employee name:"+(String)ob[0]);
				System.out.println("Employee email:"+(String)ob[1]);
				System.out.println("Employee sal:"+(Double)ob[2]);
			   }


		   }catch(Exception e) {
			e.printStackTrace();
		}
	}
}
