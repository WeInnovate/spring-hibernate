package com.atuldwivedi.learn.association.onetoone.bi;

import java.math.BigInteger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CarApp {

	static SessionFactory sessionFactory;

	public static void main(String[] args) {
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car.class)
					.addAnnotatedClass(Engine.class).buildSessionFactory();

			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();

			// create Engine
			Engine engine = new Engine(22.9d, new Integer(160));
			// create Car with Engine
			Car car = new Car(null, "Audi X", "Audi", engine);
			engine.setCar(car);
			
//			session.save(engine);
//			Car myCar = session.get(Car.class, BigInteger.valueOf(1l));
			Engine myEngine = session.get(Engine.class, BigInteger.valueOf(3l));
			System.out.println(myEngine);
			System.out.println(myEngine.getCar());
//			
//			myCar.setCompany("Tata");
//			myCar.getEngine().setMileage(18d);
			
//			session.delete(myCar);

			session.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			sessionFactory.close();
		}
	}

}
