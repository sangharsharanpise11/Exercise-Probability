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

    @Test
    void givenTwoCertainOccurenceProbability_whenCalculatingProbabilityOfvEentOccuringTogether_thenShouldReturnOne(){
        Probability headsInACoinToss=new Probability(0.5f);
        assertEquals(new Probability(0.25f),headsInACoinToss.and(headsInACoinToss));
    }

    @Test
    void givenTwoImposibleEvents_whenCalculatingProbabilityOfEitherEventOccuring_thenShouldReturnZero(){
        assertEquals(imposibleEvents,imposibleEvents.or(imposibleEvents));
    }

    @Test
    void givenImpossibleEventAndCertainEvent_whenCalculatingProbabilityOfEitherTwoEventOccuring_thenReturnOne(){
        assertEquals(certainEvents,imposibleEvents.or(certainEvents));
    }

    @Test
    void givenTwoProbabilityOfHeadAndTailsInCoinToss_whenCalculatingProbabilityOfTwoEventOccuring_thenReturnProbabilityOfOneCard(){
        Probability headsInACoinToss=new Probability(0.5f);
        Probability tailInACoinToss=new Probability(0.5f);
        assertEquals(new Probability(0.75f),headsInACoinToss.or(tailInACoinToss));
    }
}