package cn.ddsxy.ddlx.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aspectjDemo {

    @Pointcut(value="execution(* cn.ddsxy.ddlx.controller.*.*(..))")
    public void point(){

    }

    @Before(value="point()")
    public void before(){
        System.out.println("transaction begin");
    }

    @AfterReturning(value = "point()")
    public void after(){
        System.out.println("transaction commit");
    }

     @Around("point()")
     public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("transaction begin");
         Object proceed = joinPoint.proceed();
         System.out.println("transaction commit");
         return proceed;
    }
}
