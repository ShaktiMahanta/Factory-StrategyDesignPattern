package com.strategyPattern;

public class Multiplecation implements Strategy {

    @Override
    public int action(int a, int b) {
        return a*b;
    }

}
