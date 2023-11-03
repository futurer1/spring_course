package com.mikhail.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
//@Scope("prototype")
public class Dog2 implements Pet2 {
    public Dog2() {
        System.out.println("Dog 2 был создан");
    }

    @Override
    public void say() {
        System.out.println("Gav dog 2");
    }

//    @PostConstruct
//    private void init() {
//        System.out.println("Dog 2 init");
//    }
//
//    @PreDestroy
//    private void destroy() {
//        System.out.println("Dog 2 destroy");
//    }
}
