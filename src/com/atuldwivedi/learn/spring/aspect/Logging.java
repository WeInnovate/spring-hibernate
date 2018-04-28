package com.atuldwivedi.learn.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {
	
	@Pointcut("within(com.atuldwivedi.learn.spring..*)")
	public void allMethods() {}
	
	@Before("allMethods()")
	public void beforeAllMethodsInSpringPkg(JoinPoint joinPoint) {
		System.out.println(">> Method started");
	}

}
