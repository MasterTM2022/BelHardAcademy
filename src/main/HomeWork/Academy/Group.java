package main.HomeWork.Academy;

import java.util.*;

public class Group {
    private String groupName;
    private int course;
    private HashSet<Student> studentArray;
    private Teacher teacher;
    private int yearOfInput;
    private int yearOfOutput;


    public Group(String groupName, int course, HashSet<Student> studentArray, Teacher teacher, int yearOfInput, int yearOfOutput) {
        this.groupName = groupName;
        this.course = course;
        this.studentArray = studentArray;
        this.teacher = teacher;
        this.yearOfInput = yearOfInput;
        this.yearOfOutput = yearOfOutput;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public HashSet<Student> getStudentArray() {
        return studentArray;
    }

    public int getYearOfInput() {
        return yearOfInput;
    }

    public void setYearOfInput(int yearOfInput) {
        this.yearOfInput = yearOfInput;
    }

    public int getYearOfOutput() {
        return yearOfOutput;
    }

    public void setYearOfOutput(int yearOfOutput) {
        this.yearOfOutput = yearOfOutput;
    }

    public void addStudent(Student student) {
        if (this.studentArray.add(student)) {
            System.out.println("В группу " + this + "\nдобавлен " + student.toString() + "\n");
        } else {
            Exception e = new Exceptions.CheckStudentInGroup(student);
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
        }
    }

    public void delStudent(Student student) {
        if (!this.studentArray.contains(student)) {
            Exception e = new Exceptions.IsMissing(student, this);
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
        } else {
            System.out.println("Из группы " + this + "\nудален " + student.toString() + "\n");
            studentArray.remove(student);
        }
    }


    public void changeTeacher(Teacher teacher) {
        this.teacher = teacher;
        System.out.println("Надо ли изменить новому куратору его зарплату? \n1 - Да, Любая иная цифра - Нет");
        Scanner in = new Scanner(System.in);
        if (in.nextInt() == 1) {
            teacher.sallary();
        } else {
            System.out.println("Ок, не меняем.");
        }
//        in.close();
    }

    public ArrayList<People> sortByAge() {
        List<People> studentArrayList = new ArrayList<>(this.studentArray);
        Collections.sort(studentArrayList);
        return (ArrayList<People>) studentArrayList;
    }

    public ArrayList<People> sortBySurname() {
        List<People> studentArrayList = new ArrayList<>(this.studentArray);
        SurnameComparator mySurnameComparator = new SurnameComparator();
        studentArrayList.sort(mySurnameComparator);
        return (ArrayList<People>) studentArrayList;
    }

    @Override
    public String toString() {
        return "Группа №" + this.groupName + ",\nкурс - " + this.course + ",\nгруппа в составе:" + this.studentArray.toString() + ",\nкуратор - " + this.teacher.toString();
    }
}