package Academy;

import java.util.Arrays;

//import static Academy.Student.studentCreator;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Минск", "Ленина", 45, 21);
        Address address2 = new Address("Могилев", "Независимости", 19, 17);
        Address address3 = new Address("Бобруйск", "Ленина", 8, 2);
        Address address4 = new Address("Бобруйск", "Крупской", 4, 6);


        Student student1 = new Student("Иванов", "Иван", 18, address1);
        Student student2 = new Student("Петров", "Петр", 19, address2);

        Teacher teacher1 = new Teacher("Рабинович", "Абрам", 60, address3);
        Teacher teacher2 = new Teacher("Финкельштейн", "Сара", 55, address4);

        Student[] studentArray = {student1, student2};

        Group group1 = new Group ("ЭУП-4", 2, studentArray, teacher2); //Student.arrayCreator(5)

// ****************************************состояния до вызова методов
//      System.out.println(address1);
//      System.out.println(address2);
//      System.out.println(address3);
//      System.out.println(address4);
//      System.out.println(student1);
//      System.out.println(student2);
//      System.out.println(teacher1);
//      System.out.println(teacher2);
      System.out.println(group1);

// ****************************************вызовы методов
//       group1.changeStudent(student2);
//       group1.changeTeacher(teacher1);
//       teacher1.sallary(teacher1);
//       student2.changeStudentAddress();
//       teacher2.changeTeacherAddress();

        group1.addStudent();
        group1.delStudent("Иванов","Иван");

// ****************************************состояния после вызова методов
//      System.out.println(address1);
//      System.out.println(address2);
//      System.out.println(address3);
//      System.out.println(address4);
//      System.out.println(student1);
//      System.out.println(student2);
//      System.out.println(teacher1);
//      System.out.println(teacher2);
      System.out.println(group1);
    }
}