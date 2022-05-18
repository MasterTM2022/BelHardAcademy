package Academy;

import java.util.Scanner;

public abstract class People {
        public String surname;
        public  String name;
        public  int age;
        public  Address address;



        public People(String surname, String name, int age, Address address) {
               this.surname = surname;
               this.name = name;
               this.age = age;
               this.address = address;
        }

//    public static People peopleCreator(String what) {
//        Scanner in2 = new Scanner(System.in);
//        //People newPeople;
//        System.out.println("Укажите ФАМИЛИЮ " + what + ":");
//        surname = in2.next();
//        System.out.println("Укажите ИМЯ " + what + ":");
//        name = in2.next();
//        System.out.println("Укажите ВОЗРАСТ " + what + ":");
//        age = in2.nextInt();
//        System.out.println("Укажите АДРЕС " + what + ":");
//        address = Address.ChangeAddress();
//        People newPeople = new People(surname, name, age, address);
//        in2.close();
//        return newPeople;
//    }

}
