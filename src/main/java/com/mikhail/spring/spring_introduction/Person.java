package com.mikhail.spring.spring_introduction;

public class Person {
    private Pet pet;
    private String name;
    private int age;

    public Person() {
        System.out.println("Call empty constructor");
    }

//    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public void setPet(Pet pet) {
        System.out.println("Class Person set Pet");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello, pet!");
        this.pet.say();
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
