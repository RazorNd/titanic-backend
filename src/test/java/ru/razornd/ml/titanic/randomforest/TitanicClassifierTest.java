package ru.razornd.ml.titanic.randomforest;

import org.junit.Test;
import ru.razornd.ml.titanic.model.Passenger;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.razornd.ml.titanic.model.PortEmbarkation.SOUTHAMPTON;
import static ru.razornd.ml.titanic.model.Sex.MALE;
import static ru.razornd.ml.titanic.model.TicketClass.THIRD;

public class TitanicClassifierTest {

    @Test
    public void survived() {
        //PassengerId,Survived,Pclass,  Sex, Age, SibSp,  Parch, Fare,   Embarked
        //     14,       0,       3,    male, 39,   1,        5,  31.275    S
        Passenger passenger = Passenger.builder()
                .ticketClass(THIRD)
                .sex(MALE)
                .age(39)
                .sibsp(1)
                .parch(5)
                .fare(31.275)
                .portEmbarkation(SOUTHAMPTON)
                .build();

        boolean survived = TitanicClassifier.survived(passenger);

        assertThat(survived).isFalse();
    }
}