package aop.after;

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
     * @return Будет поймано исключение в методе через Advice типа @After
     */
    public List<Student> getStudents() {
        System.out.println("Начало работы метода");

        //System.out.println(students.get(3)); // студента под этим индексом нет

        System.out.println("Inform from getStudents(): ");
        System.out.println(students);
        System.out.println("Конец работы метода");
        return students;
    }
}
