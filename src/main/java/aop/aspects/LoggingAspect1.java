package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect1 {

    @Before("execution(public void getBook(aop.Book, ..))")
    public void beforeGetBookAdvice() {
        System.out.println("LoggingAspect1: Попытка получить книгу beforeGetBookAdvice");
    }

//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("Попытка вернуть книгу beforeReturnBookAdvice");
//    }
}
