package com.atuldwivedi.learn.spring.javaclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// Car car = new HondaCity();

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Car car = (Car) context.getBean("hondaAm");
		car.driveTheCar();
		context.close();

	}

}
