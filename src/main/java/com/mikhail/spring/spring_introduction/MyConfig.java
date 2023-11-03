package com.mikhail.spring.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.mikhail.spring.spring_introduction")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        System.out.println("aaaa");
        return new Cat();
    }

    @Bean
    @Scope("singleton")
    public Pet1 cat1Bean() {
        System.out.println("aaaa");
        return new Cat1();
    }

    @Bean
    @Scope("singleton")
    public Pet2 cat2Bean() {
        //System.out.println("aaaa");
        return new Cat2();
    }

    @Bean
    public Pet dogBean() {
        return new Dog();
    }

    @Bean
    public Person2 person2Bean() {
        return new Person2(cat2Bean());
    }
}
