package main.HomeWork.Academy;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Methodist extends People {
    private final ArrayList<Teacher> teacherArrayList;

    public ArrayList<Teacher> getTeacherArrayList() {
        return teacherArrayList;
    }

    public Methodist(String surname, String name, int age, Address address, ArrayList<Teacher> teacherArrayList, Gender gender) {
        super(surname, name, age, address, gender);
        this.teacherArrayList = teacherArrayList;
    }

    public void addTeacher(Teacher teacher) {
        this.teacherArrayList.add(teacher);
    }

    @Override
    public String toString() {
        return "Методист " +
                this.getSurname() + " " +
                this.getName() + ", " +
                this.getAge() + " лет, пол: " +
                this.getGender() + ", " +
                this.getAddress().toString() + ", курирует преподавателей: " +
                this.getTeacherArrayList().toString();
    }


}
