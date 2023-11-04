package aop.after_throwing.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents()");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "myException")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable myException) {

        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения");
        System.out.println("Подробности по исключению: " + myException.getMessage());
    }
}
