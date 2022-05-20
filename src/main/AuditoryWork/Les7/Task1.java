package AuditoryWork.Les7;

public class Task1 {

    public static void main(String[] args) {
        String newString;
        String s1 = "Я";
        String s2 = "JAVA";
        String s3 = "изучаю";
//        String s4 = "";
//        String s5 = "";
        String[] mass = {s1, s2, s3};
//        String newString = s1 + s2;
//        System.out.println(newString);
        newStr1(mass);
        newStr2(mass);
        newStr3(mass);
    }

    private static void newStr1(String[] mass) {
        String newString = "";
        String[] newMass = {mass[0],mass[2],mass[1]};
        for (String i : newMass) {
            newString = newString + i;
        }
        System.out.println(newString);
    }

    private static void newStr2(String[] mass) {
        String newString = "";
        String[] newMass = {mass[0],mass[2],mass[1]};
        for (String i : newMass) {
            newString = String.join(",", newMass);
        }
        System.out.println(newString);
    }

    private static void newStr3(String[] mass) {
        String newString = "";
        String[] newMass = {mass[0],mass[2],mass[1]};
        for (String i : newMass) {
            newString = newString.concat(i);
        }
        System.out.println(newString);
    }
}
