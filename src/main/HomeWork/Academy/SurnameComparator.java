package main.HomeWork.Academy;

import java.util.Comparator;

public class SurnameComparator implements Comparator<People> {

    @Override
    public int compare(People p1, People p2) {
        return p1.getSurname().compareTo(p2.getSurname());
    }

    @Override
    public Comparator<People> reversed() {
        return Comparator.super.reversed();
    }
}
