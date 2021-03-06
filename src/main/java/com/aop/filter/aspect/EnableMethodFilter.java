package com.aop.filter.aspect;

import com.aop.filter.aspect.annotation.MethodFilterAspectRegister;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
@Import({MethodFilterAspectRegister.class})
public @interface EnableMethodFilter {

    AdviceMode mode() default AdviceMode.PROXY;

    boolean proxyTargetClass() default false;

}
