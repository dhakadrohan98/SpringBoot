package com.dailycodebuffer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.dailycodebuffer.ShoppingCart.checkout(..))")
        public void beforeLogger(JoinPoint joinpoint) {
        System.out.println(joinpoint.getSignature());
        String arg = joinpoint.getArgs()[0].toString();
        System.out.println("Before loggers with Argument: "+arg);
    }

    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger() {
        System.out.println("After loggers");
    }

    @Pointcut("execution(* com.dailycodebuffer.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturningAdvice(String retVal) {
        System.out.println("After returning: "+ retVal);
    }
}
