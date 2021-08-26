package com.amigoscode;

import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> Persons = new ArrayList<>();
        Persons.add(new Person(Gender.FEMALE, 22));
        Persons.add(new Person(Gender.MALE, 30));
        Persons.add(new Person(Gender.FEMALE, 25));
        Persons.add(new Person(Gender.MALE, 43));

        List<Integer> age = new ArrayList<>();
        age.add(Integer.valueOf("Average"));

        int sum = 0;
        for (int i = 0; i < Persons.size(); i++)
            sum += Persons.get(i);
        
        Persons.forEach(person ->
                System.out.println(person.getAge()));




//        for (Person person : Persons) {
////            System.out.println(person.getAge());
//            System.out.println("Average Age =" + sum / 4);
//
//
//        }
    }


    }


//        System.out.println("Average Age =" + (biancaNavey.getAge() + sophiaSecretary.getAge() + priyaRamesh.getAge() + markJones.getAge())/4);




