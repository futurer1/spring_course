package com.mikhail.spring.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);

//        cat.say();
        Person2 person2 = context.getBean("person2Bean", Person2.class);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        //person2.callPet();
    }
}
