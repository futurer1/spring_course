package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SaveOneToOneBi {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {

//            Employee employee = new Employee("Petr", "Zagrebov", "IT", 550);
//            Detail detail = new Detail("Moscow", "123123123", "test@domain.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(employee);

//            Employee employee = new Employee("Oleg", "Novikov", "sales", 750);
//            Detail detail = new Detail("Pskov", "345345345", "novikov@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(employee);

            // получение данных из БД и связанного объекта
//            session.beginTransaction();
//            Employee empl = session.get(Employee.class, 3);
//            System.out.println(empl.getEmpDetail());


//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee empl = session.get(Employee.class, 10);
//            System.out.println(empl.getEmpDetail());

            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee empl = session.get(Employee.class, 4);

            // удалит связанные детали из таблицы details за счет CascadeType.ALL
            session.delete(empl);

            session.getTransaction().commit();
        } finally {
            session.close(); // закрывать сессию лучше в finally, чтобы
            // в случае exception не оставалась незакрытая сессия
            factory.close();
        }

    }
}
