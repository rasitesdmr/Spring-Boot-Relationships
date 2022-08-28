package com.example.springbootrelationships.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LessonControllerAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.example.springbootrelationships.controller.LessonController.createLesson(..))")
    public Object createStudentAround(ProceedingJoinPoint proceedingJoinPoint){
        logger.info("Ders kayıt isteği göderildi");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        logger.info("Ders kayıt isteği başarıyla gerçekleştirildi.");
        logger.info("Value :" + value);
        return value;
    }
}
