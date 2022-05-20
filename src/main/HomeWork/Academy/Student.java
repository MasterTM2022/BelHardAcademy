package Academy;

//import java.util.Arrays;
//import java.util.Scanner;

public class Student extends People {

    public Student(String surname, String name, int age, Address address) {
        super (surname, name, age, address);
    }

//    public Student studentCreator() {
//        Scanner in2 = new Scanner(System.in);
//        //People newPeople;
//        System.out.println("Укажите ФАМИЛИЮ студента:");
//        surname = in2.next();
//        System.out.println("Укажите ИМЯ студента:");
//        name = in2.next();
//        System.out.println("Укажите ВОЗРАСТ студента:");
//        age = in2.nextInt();
//        System.out.println("Укажите АДРЕС студента:");
//        People newStudent = new Student(surname, name, age, address);
//        ((Student) newStudent).changeStudentAddress();
//
//        in2.close();
//        return (Student) newStudent;
//    }


//    public static Student[] arrayCreator(int n) {
//        Scanner in2 = new Scanner(System.in);
//        Student[] studentArray = new Student[n];
//        for (int i = 0; i < studentArray.length; i++) {
//            System.out.println("Укажите ФАМИЛИЮ студента:");
//            surname = in2.next();
//            System.out.println("Укажите ИМЯ студента:");
//            name = in2.next();
//            System.out.println("Укажите ВОЗРАСТ студента:");
//            age = in2.nextInt();
//            System.out.println("Укажите АДРЕС студента:");
//            address = Address.ChangeAddress();
//            studentArray[i] = new Student(surname, name, age, address);
//        }
//        in2.close();
//        return studentArray;


    public Address getAddress() {
        return address;
    }

    public Address changeStudentAddress() {
        address = address.ChangeAddress();
        return address;
    }


    @Override
    public String toString() {
        return this.surname + " " + this.name + ", " + this.age+ " лет, " + this.address.toString();
    }

}