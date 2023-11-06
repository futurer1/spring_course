package hibernate_one_to_many;

import hibernate_one_to_many.entity.Department;
import hibernate_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DelOneToMany {
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

            Department dep = session.get(Department.class, 1);

            // удаление департамента приведет к удалению всех сотрудников из него
            session.delete(dep);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }

    }
}
