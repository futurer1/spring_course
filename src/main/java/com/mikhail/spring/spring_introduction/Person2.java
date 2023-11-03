package com.mikhail.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("person2Bean")
public class Person2 {
    private Pet2 pet2;

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

//    public Person2() {
//        System.out.println("Call Person2 empty constructor");
//    }

    //@Autowired()
    public Person2(/*@Qualifier("dog2")*/ Pet2 pet2) {
        this.pet2 = pet2;
    }

//    @Autowired
    public void setPet(Pet2 pet2) {
        System.out.println("Class Person1 set Pet");
        this.pet2 = pet2;
    }

    public void callPet() {
        System.out.println("Hello, pet!");
        this.pet2.say();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
