package com.atuldwivedi.learn.spring.mvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {

	@Pointcut("execution(* com.atuldwivedi.learn.spring..*.*(..))")
	public void allMethods() {
	}

	@Pointcut("execution(* com.atuldwivedi.learn.spring.mvc.controller.*.*(..))")
	public void allMethodsInController() {
	}

	// @Before("allMethods() && !allMethodsInController()")
	public void beforeAllMethodsInSpringPkg(JoinPoint joinPoint) {
		System.out.println(">> Method started " + joinPoint.getSignature());
	}

	// @AfterReturning(pointcut="allMethods()", returning="retVal")
	public void afterAllMethodsInSpringPkg(JoinPoint joinPoint, Object retVal) {
		System.out.println("<< " + joinPoint.getSignature().getName() + " " + retVal);
	}

//	@Around("allMethods()")
	public Object aroundAllMethodsInSpringPkg(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Long startMillis = System.currentTimeMillis();
		Object[] args = proceedingJoinPoint.getArgs();
		Object retVal = proceedingJoinPoint.proceed();
		Long finishMillis = System.currentTimeMillis();
		System.out.println(proceedingJoinPoint.getSignature()+" Time: "+(finishMillis - startMillis));
		return retVal;
	}
	
	@AfterThrowing(pointcut="allMethods()", throwing="ex")
	public void afterThrowingAllMethodsInSpringPkg(Throwable ex) throws Throwable {
		System.out.println(ex.getMessage());
	}
}
