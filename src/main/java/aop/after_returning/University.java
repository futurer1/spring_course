package aop.after_returning;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Vasya Petrov", 4, 4.7);
        Student st2 = new Student("Petya Ivanov", 2, 5.7);
        Student st3 = new Student("Kolya Sidorov", 1, 9.7);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    /**
     * @return ! Ответ этого метода будет изменен через Advice типа @AfterReturning
     */
    public List<Student> getStudents() {
        System.out.println("Inform from getStudents(): ");
        System.out.println(students);
        return students;
    }
}
