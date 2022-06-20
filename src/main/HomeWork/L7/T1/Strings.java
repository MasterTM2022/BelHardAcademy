package main.HomeWork.L7.T1;


import java.util.HashMap;
import java.util.Map;

//Напишите Java-программу для удаления всех пробелов из строки с помощью replace().
//Напишите программу на Java, чтобы найти повторяющиеся символы в строке.
//Напишите программу на Java для подсчета количества слов в строке.
//Напишите программу на Java для переворота последовательности символов в строке без использования встроенной в String функции reverse().
//Напишите программу на Java для переворачивания строки, изменив расположение символов в строке задом наперёд без использования встроенных в String функций.

// не понял, чем последнее задание отличается от предпоследнего...(((

// Дана строка “25 + 40 = 65”.  Замените символ “=” на слово “равно”.
// Создать два метода.
// В первом используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt(). Во втором методы StringBuilder.replace().

public class Strings {

    public static void main(String[] args) {
        task1("Напишите Java-программу для удаления всех пробелов из строки с помощью replace().");
        task2("Напишите программу на Java, чтобы найти повторяющиеся символы в строке.");
        task3("Напишите программу на Java для подсчета количества слов в строке. для подсчета количества слов в строке. слов в строке.");
        task4("Напишите программу на Java для переворота последовательности символов в строке без использования встроенной в String функции reverse().");

        task6("25 + 40 = 65");
    }

    private static void task6(String stringIn) {
        String delString = "=";
        String insString = "равно";
        String[] stringArray = stringIn.split(delString);

        StringBuilder stringOut = new StringBuilder();
        for (int x = 0; x < stringArray.length; x++) {
            stringOut.insert(stringOut.length(), stringArray[x]);
            stringOut.insert(stringOut.length(), insString);
        }

        System.out.println(stringOut.substring(0, stringOut.length() - insString.length()));
    }
    public static void task1(String stringIn) {
        String stringOut = stringIn.replace(" ", "");
        System.out.println(stringOut);
    }
    public static void task2(String stringIn) {
        char[] charArray = new char[stringIn.length()];
        for (int i = 0; i < stringIn.length(); i++) {
            charArray[i] = stringIn.charAt(i);
        }
        Map<Character, Integer> collection = new HashMap<>();
        for (Character element : charArray) {
            if (collection.containsKey(element)) {
                collection.put(element, collection.get(element) + 1);
            } else {
                collection.put(element, 1);
            }
        }
        System.out.println(toStringForTask2((HashMap<Character, Integer>) collection));
    }
    private static String toStringForTask2(HashMap<Character, Integer> collection) {
        StringBuilder stringToReturn = new StringBuilder("[");
        for (Map.Entry<Character, Integer> obj : collection.entrySet()) {
            if (obj.getValue() != 1) {
                stringToReturn.append("\'" + obj.getKey() + "\' - " + obj.getValue() + ", ");
            }
        }
        stringToReturn.setLength(stringToReturn.length() - 2);
        stringToReturn.append(']');
        return stringToReturn.toString();
    }
    public static void task3(String stringIn) {
        String[] wordArray = stringIn.split("\\s*(\\s|,|!|;|:|-|\\.)\\s*");
        Map<String, Integer> collection = new HashMap<>();
        for (String element : wordArray) {
            if (collection.containsKey(element)) {
                collection.put(element, collection.get(element) + 1);
            } else {
                collection.put(element, 1);
            }
        }
        System.out.println(toStringForTask3((HashMap<String, Integer>) collection));
    }
    private static String toStringForTask3(HashMap<String, Integer> collection) {
        StringBuilder stringToReturn = new StringBuilder("[");
        for (Map.Entry<String, Integer> obj : collection.entrySet()) {
            stringToReturn.append(obj.getKey() + " (count=" + obj.getValue() + "), ");
        }
        stringToReturn.setLength(stringToReturn.length() - 2);
        stringToReturn.append(']');
        return stringToReturn.toString();
    }
    private static void task4(String stringIn) {
        StringBuilder stringOut = new StringBuilder();
        for (int i = stringIn.length() - 1; i >= 0; i--) {
            stringOut.append(stringIn.charAt(i));
        }
        System.out.println(stringOut);
    }}