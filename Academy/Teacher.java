package Academy;

import java.util.Scanner;

public class Teacher extends People {

    public Teacher(String surname, String name, int age, Address address) {
        super (surname, name, age, address);
    }

    public Address getAddress() {
        return address;
    }

    public Address changeTeacherAddress() {
        address = address.ChangeAddress();
        return address;
    }

    public double sallary(Teacher teacher) {
        System.out.println("Расчет производим для преподавателя " + toString());
        double sallary = setBase();
        sallary = sallary + sallary * setPercentage("за степень") / 100;
        sallary = sallary + sallary * setPercentage("за стаж") / 100;
        System.out.println(toString() + ", зарплата с надбавками: " + sallary + "р.");
        return sallary;
    }

    public double setBase() {

        boolean checkbase = false;
        double base = 0;
        Scanner in = new Scanner(System.in);

        while (checkbase == false){

            System.out.println("Введите базовый оклад (не менее МПБ=450р.)");
            base  = in.nextInt();

            if (base < 450) {
                System.out.println("Оклад не может быть меньше 450р... Введите заново!");
            }
            else {
                System.out.println("Принято! Базовый оклад - " + base + "р.");
                checkbase = true;
            }
        }
        //in.close();  		//если переменную закрыть, то возникает ошибка. Как избежать???
        return base;
    }


    public int setPercentage(String descr) {

        boolean checkPer = false;
        Scanner in = new Scanner(System.in);
        int persantage = 0;

        while (checkPer == false){
            System.out.println("Введите надбавку в процентах (от 0 до 50), тип надбавки - " + descr);
            persantage = in.nextInt();
            if (persantage < 0) {
                System.out.println("Надбавка не может быть меньше 0%... Введите заново!");
            }
            else if (persantage >50) {
                System.out.println("Надбавка не может быть больше 50%... Введите заново!");
            }
            else {
                System.out.println("Принято! Надбавка «" + descr + "» - "+ persantage + "%");
                checkPer = true;
            }
        }
        //in.close();		если переменную закрыть, то возникает ошибка. Как избежать???
        return persantage;
    }


    @Override
    public String toString() {
        return this.surname + " " + this.name + ", " + this.age+ " лет, " + this.address.toString();
    }
}