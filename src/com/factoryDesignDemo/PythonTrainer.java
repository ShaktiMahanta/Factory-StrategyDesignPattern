package com.factoryDesignDemo;

public class PythonTrainer implements Trainer{
    String name;
    int salary;
    int bonus=7888;
    
    
    
    public PythonTrainer(String name, int salary) {
        super();
        this.name = name;
        this.salary = salary;
    }



    @Override
    public int addBonus() {
       salary= salary+bonus;
        return salary+bonus;
    }



    @Override
    public String toString() {
        return "PythonTrainer [name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
    }
    

}
