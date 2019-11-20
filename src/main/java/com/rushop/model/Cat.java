package com.rushop.model;

// POJO
public class Cat {
    private Dog name;

    public Cat() {
    }

    public Dog getName() {
        return name;
    }

    public void setName(Dog name) {
        this.name = name;
    }

    public Cat(Dog name) {
        this.name = name;
    }
}
