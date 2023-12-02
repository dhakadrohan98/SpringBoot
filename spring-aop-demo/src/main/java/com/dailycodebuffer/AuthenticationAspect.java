package com.dailycodebuffer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {


    @Pointcut("within(com.dailycodebuffer..*)")
    public void authenticatingPointCut() {

    }

    @Pointcut("within(com.dailycodebuffer..*)")
    public void authorizationPointCut() {

    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate() {
        System.out.println("Authenticating the request");
    }
}
