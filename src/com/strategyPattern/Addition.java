package com.strategyPattern;

public class Addition implements Strategy {

    @Override
    public int action(int a, int b) {
        
        return a+b;
    }

}
