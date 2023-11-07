package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetManyToMany {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

//          1. Получение информации по секции
            session.beginTransaction();
            Section section = session.get(Section.class, 2);
            System.out.println(section);
            System.out.println(section.getChildren());
            session.getTransaction().commit();


//          2. Получение информации по ребенку
            session.beginTransaction();
            Child child = session.get(Child.class, 4);
            System.out.println(child);
            System.out.println(child.getSections());
            session.beginTransaction().commit();


            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
