package ru.razornd.ml.titanic.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.stream.Collectors.toMap;

public class PortEmbrkationEncoder {
    private final static Map<PortEmbarkation, Integer> PORT_EMBARKATION_INTEGER_MAP = new HashMap<>();
    private final static Map<Integer, PortEmbarkation> INTEGER_PORT_EMBARKATION_MAP;

    static {
        PORT_EMBARKATION_INTEGER_MAP.put(PortEmbarkation.CHERBOURG, 0);
        PORT_EMBARKATION_INTEGER_MAP.put(PortEmbarkation.QUEENSTOWN, 1);
        PORT_EMBARKATION_INTEGER_MAP.put(PortEmbarkation.SOUTHAMPTON, 2);

        INTEGER_PORT_EMBARKATION_MAP = PORT_EMBARKATION_INTEGER_MAP.entrySet()
                .stream()
                .collect(toMap(Entry::getValue, Entry::getKey));
    }

    public static int transform(PortEmbarkation portEmbarkation) {
        return PORT_EMBARKATION_INTEGER_MAP.get(portEmbarkation);
    }

    public static PortEmbarkation inverse_transform(int encodedPort) {
        return INTEGER_PORT_EMBARKATION_MAP.get(encodedPort);
    }
}
