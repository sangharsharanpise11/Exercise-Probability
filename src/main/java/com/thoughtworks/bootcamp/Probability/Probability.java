package com.thoughtworks.bootcamp.Probability;

public class Probability {
    private final float value;

    Probability(float value)
    {
        this.value=value;
    }

    public boolean equals(Object object)
    {
        Probability that= (Probability) object;
        return this.value==that.value;
    }

}
