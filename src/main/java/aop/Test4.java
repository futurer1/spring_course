package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary3 uniLibrary3 = context.getBean("uniLibrary3", UniLibrary3.class);

        uniLibrary3.getBook();
        //uniLibrary3.returnBook();

        //uniLibrary3.getMagazine();
        uniLibrary3.returnMagazine();

        uniLibrary3.addBook();
        //uniLibrary3.addMagazine();

        context.close();
    }
}
