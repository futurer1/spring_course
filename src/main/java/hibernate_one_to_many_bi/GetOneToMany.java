package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class GetOneToMany {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();


        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department dep = session.get(Department.class, 1);
            List<Employee> emps = dep.getEmps();

            System.out.println(emps);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }

    }
}
