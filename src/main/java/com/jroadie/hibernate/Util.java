package com.jroadie.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Util {
	
	private static SessionFactory sf = createSessionFactory();
	
	private static SessionFactory createSessionFactory() throws HibernateException {
	    Configuration cfg = new Configuration();
	    cfg.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();        
	    sf = cfg.buildSessionFactory(serviceRegistry);
	    return sf;
	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}
	
	public static void close() {
		getSessionFactory().close();
	}
	
}
