package com.mikhail.spring.spring_introduction;

import org.springframework.stereotype.Component;

//@Component("cat2Bean")
public class Cat2 implements Pet2 {
    public Cat2() {
        System.out.println("Cat 2 был создан");
    }

    @Override
    public void say() {
        System.out.println("Mew cat 2");
    }
}
