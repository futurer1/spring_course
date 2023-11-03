package com.mikhail.spring.spring_introduction;


import org.springframework.stereotype.Component;

//@Component
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat был создан");
    }

    @Override
    public void say() {
        System.out.println("Mew");
    }
}
