package com.nit.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	private HibernateUtil() {
		
	}
	public synchronized static SessionFactory getSessionFactory() {
		if(factory==null) {
			factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}
	 @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return new RuntimeException("Clone not Supported");
	    }
	

}
