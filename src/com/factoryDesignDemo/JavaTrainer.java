package com.factoryDesignDemo;

public class JavaTrainer implements Trainer {
    
    String name;
    int salary;
    int bonus=1200;
    
    
    public JavaTrainer(String name, int salary) {
        super();
        this.name = name;
        this.salary = salary;
    }


    @Override
    public int addBonus() {
        salary=salary+bonus;
        return salary + bonus;
        
    }


    @Override
    public String toString() {
        return "JavaTrainer [name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
    }
    

}
