package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary3 {
    public void getBook() {
        System.out.println("Взяли книгу из UniLibrary 3");
    }

    public void getMagazine() {
        System.out.println("Взяли журнал из UniLibrary 3");
    }

    public void returnBook() {
        System.out.println("Вернули книгу в UniLibrary 3");
    }

    public void returnMagazine() {
        System.out.println("Вернули журнал в UniLibrary 3");
    }

    public void addBook() {
        System.out.println("Добавили книгу в UniLibrary 3");
    }

    public void addMagazine() {
        System.out.println("Добавили журнал в UniLibrary 3");
    }
}
