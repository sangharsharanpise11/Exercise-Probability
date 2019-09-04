package com.thoughtworks.bootcamp.Probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProbabilityTest {

    @Test
    void givenProbabilityOfTwoEventIsZero_whenCheckEquality_thenShouldReturnTrue() {
        Probability imposibleEvents=new Probability(0.0f);
        assertEquals(imposibleEvents, imposibleEvents);
    }

    @Test
    void givenProbabilityOfEventIsOneAndZero_whenCheckEquality_thenShouldReturnTrue() {
        Probability imposibleEvents=new Probability(0.0f);
        Probability certainEvents=new Probability(0.1f);
        assertNotEquals(imposibleEvents, certainEvents);
    }

}