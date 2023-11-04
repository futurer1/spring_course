package aop.around.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Around("execution(* getStudents())")
    public Object aroundGetStudentsLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable { // связь с target методом


        // действия до работы target метода
        System.out.println("aroundGetStudentsLoggingAdvice: пытается сделать");

        long time = System.currentTimeMillis();

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundGetStudentsLoggingAdvice: было залогировано исключение " + e);
            throw e;
        }


        // targetMethodResult - получили результат работы target метода
        // может изменить этот результат

        //действия после работы target метода
        long deltaTime = System.currentTimeMillis() - time;

        System.out.println("aroundGetStudentsLoggingAdvice: сделал за " + deltaTime + " мс");
        return targetMethodResult;
    }
}
