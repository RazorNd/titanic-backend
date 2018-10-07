package ru.razornd.ml.titanic.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Passenger {
    private TicketClass ticketClass;
    private Sex sex;
    private int age;
    private int sibsp;
    private int parch;
    private double fare;
    private PortEmbarkation portEmbarkation;
}
