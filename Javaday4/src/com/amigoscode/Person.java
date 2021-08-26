package com.amigoscode;


import java.util.Objects;

public class Person {
    private Gender gender;
    private Integer age;

    public Person(Gender gender, Integer age) {
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return gender == person.gender && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, age);
    }
}
