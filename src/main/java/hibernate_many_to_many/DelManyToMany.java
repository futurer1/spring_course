package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DelManyToMany {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

//          1. Удаление секции
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//            session.getTransaction().commit();

//          2. Удаление секции (к которой прикреплены дети)
//              будет удаление секции и связей, но дети останутся
//            session.beginTransaction();
//            Section section = session.get(Section.class, 6);
//            session.delete(section);
//            session.getTransaction().commit();

//          3. Удаление одного ребенка
            session.beginTransaction();
            Child child = session.get(Child.class, 4);
            session.delete(child);
            session.getTransaction().commit();


            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
