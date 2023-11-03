package com.mikhail.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");

        System.out.println("");
        Dog2 myDog = context.getBean("dog2",  Dog2.class);
        myDog.say();

        /*
        Dog2 myDog1 = context.getBean("dog2",  Dog2.class);

        System.out.println("Объекты равны: " + (myDog == myDog1));
        System.out.println(myDog);
        System.out.println(myDog1);
        */

        context.close();
    }
}

