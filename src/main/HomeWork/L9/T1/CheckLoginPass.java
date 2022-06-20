package main.HomeWork.L9.T1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.HomeWork.L9.T1.Exceptions.*;

public class CheckLoginPass {

    public static void main(String[] args) {
        String login = "admin123456789_ADMIN";
        String password = "admin123456789_ADMIN";
        String confirmPassword =  "admin123456789_ADMIN";

        System.out.println(checkLoginPass(login, password, confirmPassword));
    }
    public static boolean checkLoginPass (String login, String pass, String confirmPass) {
        try {
            return checkString(login)&&checkString(pass, confirmPass);
        } catch (WrongLoginException | WrongPasswordException | NotEqualePassException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean checkString(String login) throws WrongLoginException {
        Pattern p = Pattern.compile("[a-zA-Z0-9_]{1,20}");
        Matcher m = p.matcher(login);
        if (!m.matches()) {
            throw new WrongLoginException(login);
        } else {
            return true;
        }
    }
    public static boolean checkString(String pass, String confirmPass) throws WrongPasswordException, NotEqualePassException {
        Pattern p = Pattern.compile("[a-zA-Z0-9_]{1,20}");
        Matcher m = p.matcher(pass);
        if (!pass.equals(confirmPass)) {
            throw new NotEqualePassException();
        } else if (!m.matches()) {
            throw new WrongPasswordException();
        } else {
            return true;
        }
    }
}
