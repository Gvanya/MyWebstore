package com.packt.webstore.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.List;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({METHOD, ANNOTATION_TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = CategoryValidator.class)
public @interface Category {
    String message() default "{com.packt.webstore.validator.Category.message}";
    Class<?>[] groups() default {};
    public abstract Class<? extends Payload>[] payload() default {};
    List<String> allowedCategories =null;

}
