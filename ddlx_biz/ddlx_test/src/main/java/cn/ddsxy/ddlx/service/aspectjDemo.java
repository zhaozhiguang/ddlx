package cn.ddsxy.ddlx.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;

@Aspect
@Component
public class aspectjDemo {

    @Pointcut(value="execution(* cn.ddsxy.ddlx.controller.*.*(..))")
    public void point(){

    }

    @Before(value="point()")
    public void before(JoinPoint joinPoint){

    }

    @AfterReturning(value = "point()")
    public void after(){

    }

     @Around("point()")
     public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
         Object[] args = joinPoint.getArgs();
         for(Object arg : args){
             if(BindingResult.class.isInstance(arg)){
                 if(((BindingResult)arg).hasErrors()){
                     return ((BindingResult)arg).getFieldError().getDefaultMessage();
                 }
             }
         }
         return joinPoint.proceed();
     }
}
