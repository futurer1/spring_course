package com.mikhail.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson", Person.class);

        //Pet pet = new Cat();
        //Person person = new Person(pet);

        person.callPet();
        System.out.println(person.getName() + ", " + person.getAge());
        context.close();
    }

}
