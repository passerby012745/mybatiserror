package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerAspect {
    // 声明一个切点 里面是 execution表达式
    @Pointcut("execution( public * com.example.demo.controller..*(..))")
    private void controllerAspect() {

    }

    @Before(value ="controllerAspect()")
    public void methodBefore(JoinPoint joinPoint){
        System.out.println(joinPoint.toLongString());
    }

    @AfterReturning(returning = "o",pointcut = "controllerAspect()")
    public void returnAfter(Object o){
        System.out.println(o.toString());

    }

    }
