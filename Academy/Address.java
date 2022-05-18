package Academy;

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

    public Address ChangeAddress() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите новый адрес\n");
        System.out.println("Город?");
        city = in.next();
        System.out.println("Улица?");
        street = in.next();
        System.out.println("Дом?");
        house = in.nextInt();
        System.out.println("Квартира?");
        flat = in.nextInt();
        Address newAddress = new Address (city, street, house, flat);
        return newAddress;
    }

    @Override
    public String toString() {
        return "г." + this.city + ", ул." + this.street + ", д." + this.house + ", кв." + this.flat;
//		return this.street + " " + this.house;
    }
}