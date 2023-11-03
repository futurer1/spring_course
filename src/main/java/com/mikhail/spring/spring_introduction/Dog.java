package com.mikhail.spring.spring_introduction;

public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog был создан");
    }

    @Override
    public void say() {
        System.out.println("Gav");
    }

    private void init() {
        System.out.println("Dog init");
    }

    private void destroy() {
        System.out.println("Dog destroy");
    }
}
