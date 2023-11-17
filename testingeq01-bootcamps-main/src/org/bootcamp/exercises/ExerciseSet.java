package org.bootcamp.exercises;

public class ExerciseSet {
    public String title;
    public String instructions;
    public Bout[] bouts;

    // new ExerciseSet(title);
    public ExerciseSet(String title) {
        this.title = title;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setBouts(String[] exercises, int iterations) {
        // Create the Bouts[]
        Bout[] bouts = new Bout[exercises.length];

        for (int i = 0; i < exercises.length; i++) {
            Bout bout = new Bout();
            bout.iterations = iterations;
            Exercise exercise = new Exercise();
            exercise.name = exercises[i];
            bout.exercise = exercise;
            bouts[i] = bout;
        }

        // set the attribute for this exercise set
        this.bouts = bouts;
    }

    public Bout[] getBouts() {
        return bouts;
    }
}
