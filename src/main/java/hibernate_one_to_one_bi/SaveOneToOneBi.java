package hibernate_one_to_one_bi;

import hibernate_one_to_one_bi.entity.Detail;
import hibernate_one_to_one_bi.entity.Employee;
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
            session = factory.getCurrentSession();

            Employee employee = new Employee("Misha1", "Sidorod", "IT", 850);
            Detail detail = new Detail("London1", "3333333", "mish@domain.com");

            session.beginTransaction();

            // для сохранения необходимо установить связь в обе стороны
            // тогда при сохранении detail запишется и employee
            //employee.setEmpDetail(detail);
            //detail.setEmp(employee);
            //session.save(detail);

            //System.out.println(det.getEmp());

            // каскадное удаление одного объекта и автоматически второго связанного
            //Detail det = session.get(Detail.class, 6);
            //session.delete(det);
            //System.out.println(det);

            // удаление без каскада, за счет обнуления связи через null
            Detail det = session.get(Detail.class, 3);
            det.getEmp().setEmpDetail(null); // разрушаем foreign key связь, чтобы
            // потом отдельно удалить запись из таблицы details и этот key не помешал это сделать

            session.delete(det);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }

    }
}
