package com.mikhail.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        //Cat1 cat1 = context.getBean("cat1Bean", Cat1.class);
        Person1 person1 = context.getBean("personBean", Person1.class);
        person1.callPet();

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();

        context.close();
    }
}
