package com.factoryDesignDemo;

public class Main {
    public static void main(String[] args) {
        TrainerFactory factory = new TrainerFactory();
        Trainer trainer=factory.getTrainer("JAVA");
        trainer.addBonus();
        System.out.println(trainer);
        
        Trainer trainer1=factory.getTrainer("JS");
        trainer1.addBonus();
        System.out.println(trainer1);
        
        Trainer trainer2=factory.getTrainer("PYTHON");
        trainer2.addBonus();
        System.out.println(trainer2);
        
    }
}
