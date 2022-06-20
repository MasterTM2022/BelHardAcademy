package main.HomeWork.Academy;

public class Exceptions {

    public static class IsMissing extends Exception {
        private static final String ERROR_MSG = "Студент %s не учится в группе %s";

        public IsMissing(Student student, Group group) {
            super(String.format(ERROR_MSG, student.getSurname() + " " + student.getName(), group.getGroupName() + "(курс " + group.getCourse() + ")"));
        }
    }

    public static class CheckSallary extends Exception {
        private static final String ERROR_MSG = "Оклад не может быть меньше 450р... Введите заново!";

        public CheckSallary() {
            super(ERROR_MSG);
        }
    }

    public static class CheckStudentInGroup extends Exception {
        private static final String ERROR_MSG = "%s  - уже обучается в данной группе, повторное добавление в группу невозможно";

        public CheckStudentInGroup(Student student) {
            super(String.format(ERROR_MSG, student));
        }
    }
}
