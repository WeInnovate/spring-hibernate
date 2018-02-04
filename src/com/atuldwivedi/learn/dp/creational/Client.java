package com.atuldwivedi.learn.dp.creational;

public class Client {
	public static void main(String[] args) {
//		Singleton mySingleton = new Singleton();
		Singleton mySingleton = Singleton.getInstance();
		Singleton mySingleton2 = Singleton.getInstance();
		Singleton mySingleton3 = Singleton.getInstance();
		Singleton mySingleton4 = Singleton.getInstance();
		Singleton mySingleton5 = Singleton.getInstance();
		
		System.out.println(mySingleton.hashCode());
		System.out.println(mySingleton2.hashCode());
		System.out.println(mySingleton3.hashCode());
		System.out.println(mySingleton4.hashCode());
		System.out.println(mySingleton5.hashCode());
		mySingleton.doSomething();
	}
}
