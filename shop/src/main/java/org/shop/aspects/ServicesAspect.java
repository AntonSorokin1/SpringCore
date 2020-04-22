package org.shop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class ServicesAspect {
    private Logger logger = Logger.getLogger(ServicesAspect.class.getName());

    @Pointcut("execution(* org.shop.api.*.*(..))")
    public void servicesMethod() { }

    @Before("servicesMethod()")
    public void beforeCallServicesMethod(@NonNull JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        Object[] methodArgs = jp.getArgs();
        String message = String.format("Before call method %s with args %s", methodName, Arrays.toString(methodArgs));

        logger.log(Level.INFO, message);
    }

    @After("servicesMethod()")
    public void afterCallServicesMethod(@NonNull JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        Object[] methodArgs = jp.getArgs();
        String message = String.format("After call method %s with args %s", methodName, Arrays.toString(methodArgs));

        logger.log(Level.INFO, message);
    }
}
