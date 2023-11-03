package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary1 extends AbstractLibrary1 {
    public void getBook(Book book) {
        System.out.println("Взяли книгу " + book.getName() + " из UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Взяли журнал из UniLibrary");
    }

    public String returnBook() {
        System.out.println("Вернули книгу в UniLibrary");
        return "ok";
    }
}
