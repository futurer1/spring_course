package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary4 uniLibrary4 = context.getBean("uniLibrary4", UniLibrary4.class);

        uniLibrary4.getBook();
        //uniLibrary4.returnBook();

        //uniLibrary4.getMagazine();
        uniLibrary4.returnMagazine();

        uniLibrary4.addBook();
        //uniLibrary4.addMagazine();

        context.close();
    }
}
