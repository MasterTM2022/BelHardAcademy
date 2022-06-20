package main.HomeWork.L8.T1;

import java.util.*;

public class Collections {
    private static final int SIZE_OF_COLLECTION = 1_000_000;
    private static final int NUMBER_OF_ELEMENTS_FOR_SUM = 100_000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = fillArrayList();
        LinkedList<Integer> linkedList = fillLinkedList();

        long t = System.currentTimeMillis();
        summerFromList(arrayList,NUMBER_OF_ELEMENTS_FOR_SUM);
        t = System.currentTimeMillis() - t;
        System.out.println("Время суммирования произвольных " + NUMBER_OF_ELEMENTS_FOR_SUM + " элементов из ArrayList, милисек.: " + t);

        t = System.currentTimeMillis();
        summerFromList (linkedList, NUMBER_OF_ELEMENTS_FOR_SUM);
        t = System.currentTimeMillis() - t;
        System.out.println("Время суммирования произвольных " + NUMBER_OF_ELEMENTS_FOR_SUM + " элементов из LinkedList, милисек.: " + t);
    }

    private static void summerFromList(List<Integer> list, int numberOfElementsForSum) {
        int sum = 0;
        for (int i = 0; i < numberOfElementsForSum; i++) {
            sum += list.get((int) (Math.random() * NUMBER_OF_ELEMENTS_FOR_SUM));
        }
    }
    public static LinkedList<Integer> fillLinkedList() {
        LinkedList<Integer> array = new LinkedList();
        for (int i = 0; i < SIZE_OF_COLLECTION; i++) {
            array.add((int) (Math.random() * 1_000_000));
        }
        return array;
    }
    private static ArrayList<Integer> fillArrayList() {
        ArrayList<Integer> array = new ArrayList();
        for (int i = 0; i < 1_000_000; i++) {
            array.add((int) Math.random() * 1_000_000);
        }
        return array;
    }
}
