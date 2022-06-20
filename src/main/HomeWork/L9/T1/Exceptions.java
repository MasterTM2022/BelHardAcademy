package main.HomeWork.L9.T1;

public class Exceptions {
    public static class WrongLoginException extends Exception {
        private static final String ERROR_MSG = "Логин (%s) не соответствует критериям (не более 20 латинских букв, цифр и _). Придумайте новый, пожалуйста";

        public WrongLoginException(String login) {
            super(String.format(ERROR_MSG, login));
        }
    }

    public static class WrongPasswordException extends Exception {
        private static final String ERROR_MSG = "Пароль не соответствует критериям (не более 20 латинских букв, цифр и _). Придумайте новый, пожалуйста";
        public WrongPasswordException() {
            super(ERROR_MSG);
        }
    }

    public static class NotEqualePassException extends Exception {
        private static final String ERROR_MSG = "Пароли не совпадают. Проверьте и повторите ввод, пожалуйста";
        public NotEqualePassException() {
            super(ERROR_MSG);
        }
    }
}
