package main.HomeWork.Academy;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exceptions.IsMissing {
        ArrayList<Address> arrayAddress = new ArrayList<>();
        arrayAddress.add(new Address("Минск", "Ленина", 45, 21));
        arrayAddress.add(new Address("Могилев", "Независимости", 19, 17));
        arrayAddress.add(new Address("Бобруйск", "Ленина", 8, 2));
        arrayAddress.add(new Address("Бобруйск", "Крупской", 4, 6));
        arrayAddress.add(new Address("Гомель", "Калинина", 10, 16));
        arrayAddress.add(new Address("Гродно", "Ворошилова", 14, 26));


        Student student1 = new Student("Иванов", "Иван", 18, arrayAddress.get(0), Gender.MALE);
        Student student2 = new Student("Петров", "Петр", 19, arrayAddress.get(1), Gender.MALE);
        Student student3 = new Student("Сидоров", "Сидор", 20, arrayAddress.get(4), Gender.MALE);
        Student student4 = new Student("Еленова", "Елена", 21, arrayAddress.get(5), Gender.FEMALE);
        Teacher teacher1 = new Teacher("Рабинович", "Абрам", 60, arrayAddress.get(2), Gender.MALE);
        Teacher teacher2 = new Teacher("Финкельштейн", "Сара", 55, arrayAddress.get(3), Gender.MALE);

        Group group1 = new Group("ЭУП-4", 2, new HashSet<>(0), teacher2, 2022, 2026);
        Group group2 = new Group("ЭУП-3", 4, new HashSet<>(0), teacher1, 2020, 2024);


        Set<Teacher> arrayTeacher = new HashSet<>();
        arrayTeacher.add(teacher1);
        arrayTeacher.add(teacher2);
        arrayTeacher.add(new Teacher("Бронштейн", "Исаак", 70, new Address("Бобруйск", "Вавилова", 13, 13), Gender.MALE));




// ****************************************состояния до вызова методов
//        System.out.println(arrayAddress.get(0));
//        System.out.println(arrayAddress.get(5));
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(teacher1);
//        System.out.println(teacher2);
//        System.out.println(group1);
//        System.out.println();

// ****************************************вызовы методов
        group1.addStudent(student1);
        group1.changeTeacher(teacher1);
        teacher1.sallary();
        student2.changeStudentAddress();
        teacher2.changeTeacherAddress();

        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student4);

        group1.delStudent(student2);
        group1.delStudent(student2);

        Mover<Teacher, Methodist> mover = t -> new Methodist(t.getSurname(), t.getName(), t.getAge(), t.getAddress(), new ArrayList<>(), t.getGender());
        Methodist methodist1 = mover.convert(teacher1);

        methodist1.addTeacher(teacher2);

        System.out.println(group1.sortByAge());
        System.out.println(group1.sortBySurname());

        List<People> arrayListTeacher = new ArrayList<>(arrayTeacher);
        SurnameComparator mySurnameComparator = new SurnameComparator();

        arrayListTeacher.sort(mySurnameComparator);
        System.out.println(arrayListTeacher);

        Collections.sort(arrayListTeacher);
        System.out.println(arrayListTeacher);

// ****************************************состояния после вызова методов
//        System.out.println(arrayAddress.get(0));
//        System.out.println(arrayAddress.get(1));
//        System.out.println(arrayAddress.get(2));
//        System.out.println(arrayAddress.get(3));
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(teacher1);
//        System.out.println(teacher2);
//        System.out.println(methodist1);
//        System.out.println(group1);
    }
}