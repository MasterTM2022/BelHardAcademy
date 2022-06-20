package main.HomeWork.Academy;

public enum Gender {
    MALE("мужской"),
    FEMALE("женский"),
    OTHER("другой");
    private final String title;

    Gender(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Пол: {" + title + '}';
    }
}