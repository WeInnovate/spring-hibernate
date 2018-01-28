package com.atuldwivedi.learn.spring.lessxml;

import org.springframework.stereotype.Component;

@Component
public class AshokaLeyLandEngine implements Engine {

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " started...");
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " ...stopped");
	}

}
