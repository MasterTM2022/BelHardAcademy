package main.HomeWork.Academy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public abstract class People implements Comparable<People> {
    private String surname;
    private String name;
    private int age;
    private Address address;
    private Gender gender;
    private People o1;


    public People(String surname, String name, int age, Address address, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public int compareTo(People p1) {
        return this.age - p1.age;
    }

    public ArrayList<People> sortBySurname(HashSet hashSet) {
        List<People> peopleArrayList = new ArrayList<>(hashSet);
        SurnameComparator mySurnameComparator = new SurnameComparator();
        peopleArrayList.sort(mySurnameComparator);
        return (ArrayList<People>) peopleArrayList;
    }
}
