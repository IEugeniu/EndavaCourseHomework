package com.company;

import java.util.Objects;

public class Man {
    private String name;
    private int age;
    private Car car;

    public Man() {
    }

    public Man(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Man{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}');
        return stringBuffer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return Objects.equals(name, man.name) &&
                Objects.equals(age, man.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void walk() {
        System.out.println("Man " + name + "is walking");
    }

    public void eat() {
        System.out.println("Man " + name + "is eating");
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
