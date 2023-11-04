package aop.after.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("afterGetStudentsLoggingAdvice: успешное "
                + "выполнение метода getStudents() или выброс исключения в методе "
                + joinPoint.getSignature()
        );

        // здесь не могут быть обработаны параметры исключения
        // можно получить только сигнатуру метода через JoinPoint
    }
}
