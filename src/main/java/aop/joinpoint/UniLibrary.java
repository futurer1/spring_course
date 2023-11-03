package aop.joinpoint;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
    public void getBook() {
        System.out.println("Взяли книгу из UniLibrary");
        System.out.println("-------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Взяли журнал из UniLibrary");
        System.out.println("-------------------------------------------------");
    }

    public void returnBook() {
        System.out.println("Вернули книгу в UniLibrary");
        System.out.println("-------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Вернули журнал в UniLibrary");
        System.out.println("-------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Добавили книгу в UniLibrary");
        System.out.println("-------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Добавили журнал в UniLibrary");
        System.out.println("-------------------------------------------------");
    }
}
