package com.atuldwivedi.learn.custann;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCustValidationRule implements ConstraintValidator<BatchPrefix, String> {

	private String valueFromAnnotation;
	
	@Override
	public void initialize(BatchPrefix batchPrefix) {
		this.valueFromAnnotation = batchPrefix.value();
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext arg1) {
		
		boolean result = false;
		
		if(value == null) {
			result = true;
		}
		else {
			result = value.startsWith(valueFromAnnotation);
		}
		
		
		return result;
	}

}
