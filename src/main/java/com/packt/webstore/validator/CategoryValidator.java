package com.packt.webstore.validator;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CategoryValidator implements ConstraintValidator<Category, String> {

    private List<String> categories = Arrays.asList("tablets","phones", "laptops");

    @Override
    public void initialize(Category constraintAnnotation) {
        // left blank
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return categories.contains(value.toLowerCase());
    }

}