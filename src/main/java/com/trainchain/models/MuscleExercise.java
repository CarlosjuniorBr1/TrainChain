package com.trainchain.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Muscle")
public class MuscleExercise extends Exercise {

    private Integer repetitions;

    public Integer getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(Integer repetitions) {
        this.repetitions = repetitions;
    }

    @Override
    public void performExercise() {
        System.out.println("Performing muscle exercise: " + getName() + " for " + repetitions + " reps.");
    }
}

