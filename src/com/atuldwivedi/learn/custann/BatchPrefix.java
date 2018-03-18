package com.atuldwivedi.learn.custann;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=MyCustValidationRule.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface BatchPrefix {

	public String value() default "JM3";

	public String message() default " should start with JM3";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};
}
