package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAndSecurityAspect2 {

    @Pointcut("execution(* aop.UniLibrary4.*(..))")
    private void allMethodsFromUniLibrary4() {
    }

    @Pointcut("execution(public void aop.UniLibrary4.returnMagazine())")
    private void returnMagazineFromUniLibrary4() {
    }

    @Pointcut("allMethodsFromUniLibrary4() && !returnMagazineFromUniLibrary4()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary() {
        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibrary: writting Log #20");
    }
}
