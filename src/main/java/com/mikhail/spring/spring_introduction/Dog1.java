package com.mikhail.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Scope("singleton")
public class Dog1 implements Pet1 {
    public Dog1() {
        System.out.println("Dog 1 был создан");
    }

    @Override
    public void say() {
        System.out.println("Gav dog 1");
    }

    private void init() {
        System.out.println("Dog 1 init");
    }

    private void destroy() {
        System.out.println("Dog 1 destroy");
    }
}
