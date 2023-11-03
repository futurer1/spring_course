package aop.joinpoint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(aop.joinpoint.MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

        Book book = context.getBean("book", aop.joinpoint.Book.class);
        uniLibrary.addBook("Vasya", book);
        uniLibrary.addMagazine();
    }
}
