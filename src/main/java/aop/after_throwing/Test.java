package aop.after_throwing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);

        university.addStudents();
        try {
            List<Student> studentList = university.getStudents();
            System.out.println("Список студентов в основном методе:");
            System.out.println(studentList);
        } catch (Exception e) {
            System.out.println("Поймали исключение: " + e.getMessage());
        }

        context.close();
    }
}
