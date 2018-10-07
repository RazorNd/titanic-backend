package ru.razornd.ml.titanic.model;

public enum TicketClass {

    FIRST(1),
    SECOND(2),
    THIRD(3);

    private final int classNumber;

    TicketClass(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }
}
