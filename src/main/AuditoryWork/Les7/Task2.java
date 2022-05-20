package AuditoryWork.Les7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String newString = "";
        String s1 = "Я изучаю JAVA";
        String s2 = "скоро стану программистом";
//        String s3 = "изучаю";
//        String s4 = "";
//        String s5 = "";
//        String[] mass = {s1, s2, s3};
//        String newString = s1 + s2;
//        System.out.println(newString);
//        newStr1(mass);
//        newStr2(mass);
//        newStr3(mass);
        System.out.println(getFirstChar(s1).concat(Arrays.toString(getSubstring(s2))));

        for (int i = 0; i < getSubstring(s2).length; i++) {
            newString = newString + getSubstring(s2)[i];
        }
        
        System.out.println(getFirstChar(s1).concat(newString));
    }

    public static String getFirstChar(String str) {
        String res = str.substring(0,1);
        return res;
    }

    public static char[] getSubstring(String str) {
        int startChar = 5;
        char[] mass = new char[str.length()-startChar];
        str.getChars(startChar, str.length(), mass,0);
        return mass;
    }
}
