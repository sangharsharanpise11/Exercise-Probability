package com.thoughtworks.bootcamp.Probability;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProbabilityTest {

    @Test
    void givenProbabilityOfTwoEventIsZero_whenCheckProbability_thenShouldReturnTrue() {
        Probability imposibleEvents=new Probability(0.0f);

        assertEquals(imposibleEvents, imposibleEvents);
    }

}