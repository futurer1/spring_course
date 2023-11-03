package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect1 {

    @Pointcut("execution(* aop.UniLibrary3.get*())")
    private void allGetMethodsFromUniLibrary3() {
    }

    @Pointcut("execution(* aop.UniLibrary3.return*())")
    private void allReturnMethodsFromUniLibrary3() {
    }

    @Pointcut("allGetMethodsFromUniLibrary3() || allReturnMethodsFromUniLibrary3()")
    private void allGetAndReturnMethodsFromUniLibrary3() {

    }

    @Before("allGetMethodsFromUniLibrary3()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writting Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary3()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writting Log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary3()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writting Log #3");
    }

}
