package com.atuldwivedi.learn.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// Car car = new HondaCity();

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/atuldwivedi/learn/spring/xml/spring-config.xml");
		Car car = (Car) context.getBean("car3");
		car.driveTheCar();

	}

}
