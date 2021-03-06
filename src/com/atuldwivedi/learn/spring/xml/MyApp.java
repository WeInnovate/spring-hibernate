package com.atuldwivedi.learn.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// Car car = new HondaCity();

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/atuldwivedi/learn/spring/xml/spring-config.xml");
		
		Car car = (Car) context.getBean("car3");
		Car car2 = (Car) context.getBean("car3");
		Car car3 = (Car) context.getBean("car3");
		Car car4 = (Car) context.getBean("car3");
		System.out.println(car.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car3.hashCode());
		System.out.println(car4.hashCode());
		car.driveTheCar();

	}

}
