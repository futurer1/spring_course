package com.mikhail.spring.spring_introduction;

import org.springframework.stereotype.Component;

//@Component("cat1Bean")
public class Cat1 implements Pet1 {
    public Cat1() {
        System.out.println("Cat 1 был создан");
    }

    @Override
    public void say() {
        System.out.println("Mew cat 1");
    }
}
