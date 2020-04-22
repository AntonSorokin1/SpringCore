package org.shop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class RepositoryAspect {
    private Logger logger = Logger.getLogger(RepositoryAspect.class.getName());

    @Pointcut("execution(* org.shop.repository.*.*(..))")
    public void repositoryMethod() { }

    @Before("repositoryMethod()")
    public void beforeCallRepositoryMethod(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        Object[] methodArgs = jp.getArgs();
        String message = String.format("Before call method %s with args %s", methodName, Arrays.toString(methodArgs));

        logger.log(Level.INFO, message);
    }

    @After("repositoryMethod()")
    public void afterCallRepositoryMethod(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        Object[] methodArgs = jp.getArgs();
        String message = String.format("After call method %s with args %s", methodName, Arrays.toString(methodArgs));

        logger.log(Level.INFO, message);
    }
}
