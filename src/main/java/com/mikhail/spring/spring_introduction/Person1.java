package com.mikhail.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person1 {
    //@Autowired
    //@Qualifier("dog1")
    private Pet1 pet1;

    //@Value("${person.name}")
    private String name;

    //@Value("${person.age}")
    private int age;

//    public Person1() {
//        System.out.println("Call Person1 empty constructor");
//    }

//    @Autowired()
    public Person1(/*@Qualifier("cat1Bean")*/ Pet1 pet1) {
        this.pet1 = pet1;
    }

//    @Autowired
    public void setPet(Pet1 pet1) {
        System.out.println("Class Person1 set Pet");
        this.pet1 = pet1;
    }

    public void callPet() {
        System.out.println("Hello, pet!");
        this.pet1.say();
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
