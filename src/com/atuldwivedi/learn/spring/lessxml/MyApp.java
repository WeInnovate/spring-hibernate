package com.atuldwivedi.learn.spring.lessxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// Car car = new HondaCity();

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/atuldwivedi/learn/spring/lessxml/spring-config.xml");
		Car car = (Car) context.getBean("hondaAm");
		car.driveTheCar();

	}

}
