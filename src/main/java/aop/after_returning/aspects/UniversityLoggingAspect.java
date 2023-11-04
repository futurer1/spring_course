package aop.after_returning.aspects;

import aop.after_returning.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
            returning = "students"
    )
    public void afterReturningGetStudentsLoggingAdvice(JoinPoint joinPoint, // возможность так же использовать JoinPoint
                                                       List<Student> students) { // обязательно совпадение
        // названия students с returning = "students"

        Student firstStudent = students.get(0);

        // так делать нельзя, с точки зрения SOLID
        // сделано чтобы продемонстрировать возможность

        // изменим имя
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        // увеличим балл
        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов после работы метода getStudents()");
    }
}
