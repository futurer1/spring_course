package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Oleg", "Sidorov", "HR", 700);

            session.beginTransaction();
            session.save(employee);


            int myId = employee.getId();
            Employee myEmployee = session.get(Employee.class, myId);

            session.getTransaction().commit();
            System.out.println(myEmployee);

        } finally {
            factory.close();
        }

    }
}
