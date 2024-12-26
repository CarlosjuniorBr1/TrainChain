package com.trainchain.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Cardio")
public class CardioExercise extends Exercise {

    private Integer duration;

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public void performExercise() {
        System.out.println("Performing cardio exercise: " + getName() + " for " + duration + " minutes.");
    }
}

