package main.HomeWork.Academy;

public class Student extends People{

    public Student(String surname, String name, int age, Address address, Gender gender) {
        super(surname, name, age, address, gender);
    }
    public void changeStudentAddress() {
        getAddress().ChangeAddress();
    }


    @Override
    public String toString() {
        return "Студент "+
                this.getSurname() + " " +
                this.getName() + ", " +
                this.getAge() + " лет, " +
                this.getAddress().toString() + ", пол: " +
                this.getGender();
    }

}