package com.factoryDesignDemo;

public class TrainerFactory {
    public Trainer getTrainer(String trainerSkills) {
        if(trainerSkills.equals("JAVA")) {
            return new JavaTrainer("Shakti", 100000);
        }
        else if(trainerSkills.equals("PYTHON")) {
            return new PythonTrainer("Raja", 700000);
        }
        else if(trainerSkills.equals("JS")) {
            return new JSTrainer("Hari", 600000);
        }
        return null;
    }
}
