package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveManyToMany {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

//          1. Сохранение новой секции с детьми в ней
//            Section section1 = new Section("Footbal");
//            Child child1 = new Child("Vasya", 6);
//            Child child2 = new Child("Pety", 7);
//            Child child3 = new Child("Grisha", 5);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//            session.beginTransaction();
//            session.save(section1);
//            session.getTransaction().commit();


//          2. Добавление ребенка с несколькими секциями
//            Section section2 = new Section("Volleyball");
//            Section section3 = new Section("Chess");
//            Section section4 = new Section("Math");
//            Child child4 = new Child("Igor", 10);
//            child4.addSectionToChild(section1);
//            child4.addSectionToChild(section2);
//            child4.addSectionToChild(section3);
//            session.beginTransaction();
//            session.save(child4);
//            session.getTransaction().commit();

            Section section5 = new Section("Dance");
            Child child5 = new Child("Olya", 6);
            Child child6 = new Child("Grisha", 7);
            Child child7 = new Child("Pavel", 5);
            section5.addChildToSection(child5);
            section5.addChildToSection(child6);
            section5.addChildToSection(child7);
            session.beginTransaction();
            session.persist(section5);
            session.getTransaction().commit();


            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
