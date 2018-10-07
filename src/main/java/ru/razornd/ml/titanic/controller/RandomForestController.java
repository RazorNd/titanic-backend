package ru.razornd.ml.titanic.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ru.razornd.ml.titanic.dto.Survived;
import ru.razornd.ml.titanic.model.Passenger;
import ru.razornd.ml.titanic.randomforest.TitanicClassifier;

@RestController
@RequestMapping("/api/random-forest/")
public class RandomForestController {
    @PostMapping(value = "/survived", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Mono<Survived> isSurvived(@RequestBody Passenger passenger) {
        return Mono.just(passenger)
                .map(TitanicClassifier::survived)
                .map(Survived::new);
    }
}
