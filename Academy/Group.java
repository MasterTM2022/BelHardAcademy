package Academy;

import java.util.Arrays;
import java.util.Scanner;

public class Group {
    private String groupName;
    private int course;
    private Student[] studentArray;
    private Teacher teacher;

    public Group(String groupName, int course, Student[] studentArray, Teacher teacher) {
        this.groupName = groupName;
        this.course = course;
        this.studentArray = studentArray;
        this.teacher = teacher;
    }

    public void addStudent() {
        Student newStudent = new Student("Сидоров", "Сидор", 30, new Address("Гродно", "Ленина", 100, 100));
        Student[] newStudentArray = new Student[studentArray.length + 1];
        for (int i = 0; i < studentArray.length; i++) {
            newStudentArray[i] = studentArray[i];
        }
        newStudentArray[studentArray.length] = newStudent;
        this.studentArray = newStudentArray;
    }

    public void delStudent(String surname, String name) {
        boolean flag = false;
        int i = 0;
        int step = 0;
        Student[] newStudentArray = new Student[studentArray.length - 1];
        while (i < studentArray.length) {
            if (studentArray[i].surname == surname & studentArray[i].name == name) {
                step++;
            } else {
                newStudentArray[i - step] = studentArray[i];
            }
            i++;
        }
        this.studentArray = newStudentArray;
    }

    public void changeTeacher(Teacher teacher) {
        this.teacher = teacher;
        System.out.println("Надо ли изменить новому куратору его зарплату? \n1 - Да, Любая иная цифра - Нет");
        Scanner in = new Scanner(System.in);
        if (in.nextInt()==1) {
            teacher.sallary(this.teacher);
        }
        else {
            System.out.println("Ок, не меняем.");
        }
        in.close();
    }


    @Override
    public String toString() {
        return "Группа №" + this.groupName + ",\nкурс - " + this.course + ",\nгруппа в составе:" + Arrays.deepToString(this.studentArray) + ",\nкуратор - " + this.teacher.toString();
    }
}