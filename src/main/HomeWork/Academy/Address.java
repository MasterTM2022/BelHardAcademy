package main.HomeWork.Academy;

import java.util.Scanner;

public class Address {
    private String city;
    private String street;
    private int house;
    private int flat;

    public Address(String city, String street, int house, int flat) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public void ChangeAddress() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите новый адрес\n");
        System.out.println("Город?");
        setCity(in.next());
        System.out.println("Улица?");
        setStreet(in.next());
        System.out.println("Дом?");
        setHouse(in.nextInt());
        System.out.println("Квартира?");
        setFlat(in.nextInt());
    }

    @Override
    public String toString() {
        return "г." + this.city + ", ул." + this.street + ", д." + this.house + ", кв." + this.flat;
    }
}