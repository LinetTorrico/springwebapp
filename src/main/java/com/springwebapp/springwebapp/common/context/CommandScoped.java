package com.springwebapp.springwebapp.common.context;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import java.lang.annotation.*;

/**
 * @Linet Torrico
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Scope("prototype")
public @interface CommandScoped {

}
