package hibernate_eager_lazy;

import hibernate_eager_lazy.entity.Department;
import hibernate_eager_lazy.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class GetEager {
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

//            Department dep = new Department("Sales", 1200, 350);
//            Employee emp1 = new Employee("Ivan", "Nikolaev", 800);
//            Employee emp2 = new Employee("Semen", "Vasilev", 1000);
//            Employee emp3 = new Employee("Igor", "Lazy", 900);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//            session.save(dep);
//            session.getTransaction().commit();


            System.out.println("Получение департамента");
            Department dep =  session.get(Department.class, 4);
            System.out.println(dep);

            System.out.println("Получение работников");
            System.out.println(dep.getEmps());


            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }

    }
}
