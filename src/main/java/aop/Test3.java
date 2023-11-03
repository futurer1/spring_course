package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary2 uniLibrary2 = context.getBean("uniLibrary2", UniLibrary2.class);
        uniLibrary2.getBook();
        uniLibrary2.getMagazine();
        //uniLibrary1.returnBook();

        //SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        //schoolLibrary.getBook();

        context.close();
    }
}
