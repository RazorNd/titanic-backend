package ru.razornd.ml.titanic.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.razornd.ml.titanic.model.PortEmbarkation.SOUTHAMPTON;
import static ru.razornd.ml.titanic.model.Sex.MALE;
import static ru.razornd.ml.titanic.model.TicketClass.THIRD;

public class PassengerTest {

    private static final Passenger PASSENGER = Passenger.builder()
            .ticketClass(THIRD)
            .sex(MALE)
            .age(39)
            .sibsp(1)
            .parch(5)
            .fare(31.275)
            .portEmbarkation(SOUTHAMPTON)
            .build();
    
    private static final String JSON = "{\n" +
            "  \"ticketClass\": \"THIRD\",\n" +
            "  \"sex\": \"MALE\",\n" +
            "  \"age\": 39,\n" +
            "  \"sibsp\": 1,\n" +
            "  \"parch\": 5,\n" +
            "  \"fare\": 31.275,\n" +
            "  \"portEmbarkation\": \"SOUTHAMPTON\"\n" +
            "}";

    @Test
    public void serialize() throws JsonProcessingException, JSONException {
        ObjectMapper objectMapper = new ObjectMapper();

        String value = objectMapper.writeValueAsString(PASSENGER);

        JSONAssert.assertEquals(JSON, value, true);
    }

    @Test
    public void deserialize() throws IOException {
        Passenger passenger = new ObjectMapper().readValue(JSON, Passenger.class);

        assertThat(passenger).isEqualTo(PASSENGER);
    }
}