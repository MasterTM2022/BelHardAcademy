package main.HomeWork.Academy;

import main.HomeWork.Academy.Exceptions.CheckSallary;

import java.util.Scanner;

public class Teacher extends People {

    public Teacher(String surname, String name, int age, Address address, Gender gender) {
        super(surname, name, age, address, gender);
    }

    public void changeTeacherAddress() {
        getAddress().ChangeAddress();
    }

    public double sallary() {
        System.out.println("Расчет производим для преподавателя " + this);
        double sallary = setBase();
        sallary = sallary + sallary * setPercentage("за степень") / 100;
        sallary = sallary + sallary * setPercentage("за стаж") / 100;
        System.out.println(this + ", зарплата с надбавками: " + sallary + "р.");
        return sallary;
    }

    public double setBase() {
        double base = 0;
        Scanner in = new Scanner(System.in);
        while (base < 450) {
            System.out.println("Введите базовый оклад (не менее МПБ = 450р.)");
            try {
                base = in.nextInt();
                if (base < 450) {
                    throw new CheckSallary();
                } else {
                    System.out.println("Принято! Базовый оклад - " + base + "р.");
                }
            } catch (CheckSallary checkSallary) {
                System.out.println("\u001B[31m" + checkSallary.getMessage() + "\u001B[0m");
            }
        }
        //in.close();  		//если переменную закрыть, то возникает ошибка. Как избежать???
        return base;
    }


    public int setPercentage(String descr) {
        boolean checkPer = false;
        Scanner in = new Scanner(System.in);
        int persantage = 0;

        while (!checkPer) {
            System.out.println("Введите надбавку в процентах (от 0 до 50), тип надбавки - " + descr);
            persantage = in.nextInt();
            if (persantage < 0) {
                System.out.println("\u001B[31m" + "Надбавка не может быть меньше 0%... Введите заново!" + "\u001B[0m");
            } else if (persantage > 50) {
                System.out.println("\u001B[31m" + "Надбавка не может быть больше 50%... Введите заново!" + "\u001B[0m");
            } else {
                System.out.println("Принято! Надбавка «" + descr + "» - " + persantage + "%");
                checkPer = true;
            }
        }
        //in.close();		если переменную закрыть, то возникает ошибка. Как избежать???
        return persantage;
    }

    @Override
    public String toString() {
        return "Преподаватель " +
                this.getSurname() + " " +
                this.getName() + ", " +
                this.getAge() + " лет, пол: " +
                this.getGender() + ", " +
                this.getAddress().toString();
    }
}