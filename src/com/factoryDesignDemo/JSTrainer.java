package com.factoryDesignDemo;

public class JSTrainer implements Trainer {
    String name;
    int salary;
    int bonus=90909;
    

    public JSTrainer(String name, int salary) {
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
        return "JSTrainer [name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
    }
    

}
