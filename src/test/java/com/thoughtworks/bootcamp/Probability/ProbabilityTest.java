package com.thoughtworks.bootcamp.Probability;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProbabilityTest {
    private static Probability imposibleEvents;
    private static Probability certainEvents;

    @BeforeAll
    static void setUp(){
        imposibleEvents=new Probability(0.0f);
        certainEvents=new Probability(1.0f);
    }
    @Test
    void givenProbabilityOfTwoEventIsZero_whenCheckEquality_thenShouldReturnTrue() {
        assertEquals(imposibleEvents, imposibleEvents);
    }

    @Test
    void givenProbabilityOfEventIsOneAndZero_whenCheckEquality_thenShouldReturnTrue() {
        assertNotEquals(imposibleEvents, certainEvents);
    }

    @Test
    void givenZeroOccurenceProbability_whenCheckEquality_thenShouldReturnOne() {
        assertEquals(certainEvents,imposibleEvents.not());
    }

    @Test
    void givenOneOccurenceProbability_whenCheckEquality_thenShouldReturnZero() {
        assertEquals(certainEvents.not(),imposibleEvents);
    }
}