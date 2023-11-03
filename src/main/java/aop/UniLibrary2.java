package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary2 extends AbstractLibrary1 {
    public void getBook() {
        System.out.println("Взяли книгу из UniLibrary 2");
    }

    public void getMagazine() {
        System.out.println("Взяли журнал из UniLibrary 2");
    }

    public String returnBook() {
        System.out.println("Вернули книгу в UniLibrary 2");
        return "ok";
    }
}
