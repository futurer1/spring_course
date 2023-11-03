package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Взяли книгу из UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Взяли журнал из UniLibrary");
    }

    public String returnBook() {
        System.out.println("Вернули книгу в UniLibrary");
        return "ok";
    }
}
