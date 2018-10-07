package ru.razornd.ml.titanic.model;

public enum PortEmbarkation {

    CHERBOURG('C'),
    QUEENSTOWN('Q'),
    SOUTHAMPTON('S');

    private final char portIndicator;

    PortEmbarkation(char portIndicator) {
        this.portIndicator = portIndicator;
    }

    public char getPortIndicator() {
        return portIndicator;
    }
}
