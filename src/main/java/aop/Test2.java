package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book", Book.class);

        UniLibrary1 uniLibrary1 = context.getBean("uniLibrary1", UniLibrary1.class);
        uniLibrary1.getBook(book);
        //uniLibrary1.getMagazine();
        //uniLibrary1.returnBook();

        //SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        //schoolLibrary.getBook();

        context.close();
    }
}
