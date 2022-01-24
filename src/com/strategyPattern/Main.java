package com.strategyPattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Addition());
        System.out.println("Add:" +context.execute(10, 5));
        
        Context context1 = new Context(new Multiplecation());
        System.out.println("Mul:" + context1.execute(10, 5));
        
        Context context2 = new Context(new Division());
        System.out.println("Division:" + context2.execute(10, 5));
    }
}
