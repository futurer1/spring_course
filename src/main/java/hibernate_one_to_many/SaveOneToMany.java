package hibernate_one_to_many;

import hibernate_one_to_many.entity.Department;
import hibernate_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SaveOneToMany {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department dep = new Department("HR", 1500, 400);
            Employee emp1 = new Employee("Igor", "Zakharov", 800);
            Employee emp2 = new Employee("Andrey", "Vasilev", 1000);

            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
            session.save(dep);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }

    }
}
