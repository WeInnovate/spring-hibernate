package com.atuldwivedi.learn.dp.creational;

public class Singleton {

	private static Singleton singleton;

	private Singleton() {
		System.out.println("Singleton object is being constructed...");
	}

	public static synchronized Singleton getInstance() {
		if (null == singleton) {
			singleton =new Singleton();
		}
		return singleton;
	}

	public void doSomething() {
		System.out.println("I'm doing something....");
	}
}
