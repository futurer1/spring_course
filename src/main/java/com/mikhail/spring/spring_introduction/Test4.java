package com.mikhail.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        Dog dog1 = context.getBean("myPet", Dog.class);

        System.out.println(dog); // ссылаются на один и тот же объект
        System.out.println(dog1);

        dog.say();
        context.close();
    }
}
