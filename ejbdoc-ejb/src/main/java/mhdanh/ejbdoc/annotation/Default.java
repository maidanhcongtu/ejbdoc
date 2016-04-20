package mhdanh.ejbdoc.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.FIELD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
@Target({TYPE,FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Default {

}
